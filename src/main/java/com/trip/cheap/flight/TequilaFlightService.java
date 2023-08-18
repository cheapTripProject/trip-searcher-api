package com.trip.cheap.flight;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.trip.cheap.flight.model.request.FlightQueryParam;
import com.trip.cheap.flight.model.response.FlightResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
@Log4j2
public class TequilaFlightService {

    @Value("${apikey}")
    private String apiKey;

    public FlightResponse sendTequilaSearchRequest(
        FlightQueryParam flightQueryParam) throws IOException, InterruptedException {
        String urlRequest = RequestUtil.resolveRequest(flightQueryParam);

        HttpClient httpClient = HttpClient.newHttpClient();
        log.info("request: GET: " + URI.create(urlRequest));
        HttpRequest request = HttpRequest.newBuilder(URI.create(urlRequest))
                                         .header("apikey", apiKey)
                                         .header("accept", MediaType.APPLICATION_JSON.getType())
                                         .GET()
                                         .build();
        ObjectMapper objectMapper = new ObjectMapper();
        String response = httpClient.send(request, HttpResponse.BodyHandlers.ofString()).body();
        return objectMapper.readValue(response, FlightResponse.class);
    }

}
