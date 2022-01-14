package com.pb.zelenaja.hw14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {

        int portNumber = 1234;
        Socket socket = new Socket("127.0.0.1", portNumber);
        System.out.println("Client is started");

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        pw.println("Test string for transmission");

        String dataFromUser, dataFromServer;

        while ((dataFromUser = bfr.readLine()) != null) {
            pw.println(dataFromUser);
            dataFromServer = br.readLine();
            System.out.println(dataFromServer);
            if ("exit".equalsIgnoreCase(dataFromUser)) {
                break;
            }
        }
        pw.close();
        br.close();
        bfr.close();
        socket.close();
    }
}