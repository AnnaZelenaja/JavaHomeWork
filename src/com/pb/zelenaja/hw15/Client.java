package com.pb.zelenaja.hw15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;

public class Client extends JFrame {
    private static final String serIp = "127.0.0.1";
    private static final int serPort = 1234;

    private Socket socket;
    private BufferedReader br;
    private PrintWriter pw;
    private JTextArea jtAreaMessage;
    private JTextField jtfMessage;

    public Client() {
        try {
            socket = new Socket(serIp, serPort);
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        setBounds(600, 300, 600, 500);
        setTitle("Client");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jtAreaMessage = new JTextArea();
        jtAreaMessage.setEditable(false);
        jtAreaMessage.setLineWrap(true);
        add(jtAreaMessage, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        add(bottomPanel, BorderLayout.SOUTH);
        jtfMessage = new JTextField();
        bottomPanel.add(jtfMessage, BorderLayout.CENTER);
        JButton jbSendMessage = new JButton("Send..");
        bottomPanel.add(jbSendMessage, BorderLayout.EAST);

        jbSendMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jtfMessage.getText().trim().isEmpty()) {
                    sendMsg();
                }
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String dataFromServer;
                    while ((dataFromServer = br.readLine()) != null) {
                        jtAreaMessage.append(dataFromServer);
                        jtAreaMessage.append("\n");
                    }
                } catch (Exception e) {
                }
            }
        }).start();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                try {
                    pw.println("Client disconnected");
                    pw.close();
                    br.close();
                    socket.close();
                } catch (IOException exc) {
                }
            }
        });

        setVisible(true);
    }

    public void sendMsg() {
        String messageStr = jtfMessage.getText();
        pw.println(messageStr);
        jtfMessage.setText("");
    }
}