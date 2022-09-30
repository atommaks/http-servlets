package ru.atom.http.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServerRunner {
    public static void main(String[] args) throws Exception{
        try (final var dataGramServer = new DatagramSocket(7777)) {
            byte[] buffer = new byte[512];
            final var packet = new DatagramPacket(buffer, buffer.length);
            dataGramServer.receive(packet);

            System.out.println(new String(buffer));
        }
    }
}
