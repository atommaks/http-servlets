package ru.atom.http.client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {
    public static void main(String[] args) throws Exception {
        final var client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();

        final var request = HttpRequest.newBuilder(URI.create("https://www.google.com"))
                .GET()
                .build();
        final var resp = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(resp.body());
    }
}
