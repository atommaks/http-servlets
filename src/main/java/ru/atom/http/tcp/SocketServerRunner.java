package ru.atom.http.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.util.Scanner;

public class SocketServerRunner {
    public static void main(String[] args) throws Exception{
        try(final var server = new ServerSocket(7777);
            final var socket = server.accept();
            final var outputStream = new DataOutputStream(socket.getOutputStream());
            final var inputStream = new DataInputStream(socket.getInputStream());
            final var scanner = new Scanner(System.in)) {
            var req = inputStream.readUTF();
            while (!"stop".equals(req)) {
                System.out.println("Client's request: %s".formatted(req));
                final var resp = scanner.nextLine();
                outputStream.writeUTF(resp);
                req = inputStream.readUTF();
            }
        }
    }
}
