package ru.atom.http.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Inet4Address;
import java.net.Socket;
import java.util.Scanner;

public class SocketRunner {
    public static void main(String[] args) throws Exception{
        var inetAddress = Inet4Address.getByName("localhost");
        try (final var socket = new Socket(inetAddress, 7777);
             final var outputStream = new DataOutputStream(socket.getOutputStream());
             final var inputStream = new DataInputStream(socket.getInputStream())) {
            var scanner = new Scanner(System.in);
            while(scanner.hasNextLine()) {
                var req = scanner.nextLine();
                outputStream.writeUTF(req);
                System.out.println("Server's resp: %s".formatted(inputStream.readUTF()));
            }
        }

    }
}
