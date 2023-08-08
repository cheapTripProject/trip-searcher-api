package com.trip.cheap.flight;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class TequilaFlightService {

    @Value("${apikey}")
    private String apiKey;

    public ResponseEntity<String> sendTequilaSearchRequest(FlightQueryParam flightQueryParam) {
        if(apiKey instanceof String)
        return ResponseEntity.ok("ok");


    }

}
