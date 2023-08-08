package com.trip.cheap.flight;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class TequilaFlightService {

    @Value("${apikey}")
    private String apiKey;

    public HttpResponse sendTequilaSearchRequest(FlightQueryParam flightQueryParam) throws IOException, InterruptedException {
        String urlRequest = RequestUtil.resolveRequest(flightQueryParam);

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(urlRequest))
                .header("apikey", apiKey)
                .header("accept", MediaType.APPLICATION_JSON.getType())
                .GET()
                .build();
        return httpClient.send(request, HttpResponse.BodyHandlers.ofString());


    }

}
