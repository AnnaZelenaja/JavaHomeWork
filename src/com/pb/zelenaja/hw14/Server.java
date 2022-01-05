package com.pb.zelenaja.hw14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server {

    static class Handler implements Runnable {
        private final Socket clientSocket;

        public Handler(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
            try {
                BufferedReader inbr = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter outpw = new PrintWriter(clientSocket.getOutputStream(), true);
                String clientMessage;

                System.out.println("Waiting for messages..");
                while ((clientMessage = inbr.readLine()) != null) {
                    if ("exit".equalsIgnoreCase(clientMessage)) {
                        break;
                    }
                    outpw.println("Server: " + LocalDateTime.now().withNano(0) + " "  + clientMessage);
                    System.out.println(Thread.currentThread().getName() + " " + clientMessage);
                }

                outpw.close();
                inbr.close();

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    clientSocket.close();
                } catch (Exception e) {

                }
            }
        }
    }


    public static void main(String[] args) throws Exception {
        int serverPort = 1234;
        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("Server start. Port : " + serverPort);
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        while (true) {
            try {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected");
                threadPool.submit(new Server.Handler(clientSocket));
            } catch (IOException e) {
                System.out.println("Unable a connection");
                System.exit(-1);
            }
        }
    }
}