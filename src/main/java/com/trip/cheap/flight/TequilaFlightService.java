package com.trip.cheap.flight;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.trip.cheap.flight.model.request.FlightQueryParam;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class TequilaFlightService {

    @Value("${apikey}")
    private String apiKey;

    public String sendTequilaSearchRequest(FlightQueryParam flightQueryParam) throws IOException, InterruptedException {
        String urlRequest = RequestUtil.resolveRequest(flightQueryParam);

        HttpClient httpClient = HttpClient.newHttpClient();
        log.info("request: GET: " + URI.create(urlRequest));
        HttpRequest request = HttpRequest.newBuilder(URI.create(urlRequest))
                .header("apikey", apiKey)
                .header("accept", MediaType.APPLICATION_JSON.getType())
                .GET()
                .build();
        return httpClient.send(request, HttpResponse.BodyHandlers.ofString()).body();
    }

}
