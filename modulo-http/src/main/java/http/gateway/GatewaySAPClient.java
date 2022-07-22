package http.gateway;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GatewaySAPClient {

    public void integra() throws URISyntaxException {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://viacep.com.br/ws/01001000/json/"))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("dados enviados para SAP: "+response.statusCode());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
