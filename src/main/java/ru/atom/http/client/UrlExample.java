package ru.atom.http.client;

import java.net.URL;

public class UrlExample {

    public static void main(String[] args) throws Exception {
        var url = new URL("file:/Users/ATOM/IdeaProjects/http-servlets/src/main/java/ru/atom/http/tcp/SocketRunner.java");
        var urlConnection = url.openConnection();
        System.out.println(new String(urlConnection.getInputStream().readAllBytes()));
    }

    private static void checkGoogle() throws Exception {
        var url = new URL("https://www.google.com");
        var urlConnection = url.openConnection();
    }

}
