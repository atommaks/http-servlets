package ru.atom.http.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
    private final int port;

    public HttpServer(int port) {
        this.port = port;
    }

    public void run() {
        try {
            var server = new ServerSocket(port);
            var socket = server.accept();
            processSocket(socket);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private void processSocket(Socket socket) {
        try (var inputStream = new DataInputStream(socket.getInputStream());
            var outputStream = new DataOutputStream(socket.getOutputStream())) {
            System.out.println("Request: %s".formatted(new String(inputStream.readAllBytes())));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
