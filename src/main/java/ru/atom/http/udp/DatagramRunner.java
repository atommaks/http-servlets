package ru.atom.http.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.nio.charset.StandardCharsets;

public class DatagramRunner {
    public static void main(String[] args) throws Exception{
        final var inetAddress = Inet4Address.getByName("localhost");
        try(final var datagramSocket = new DatagramSocket()) {
            var bytes = "Hello from UDP client".getBytes(StandardCharsets.UTF_8);
            final var packet = new DatagramPacket(bytes, bytes.length, inetAddress, 7777);
            datagramSocket.send(packet);
        }
    }
}