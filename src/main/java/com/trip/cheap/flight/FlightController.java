package com.trip.cheap.flight;

import java.io.IOException;
import java.net.http.HttpResponse;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Log4j2
@Controller
public class FlightController {

    @Autowired
    private TequilaFlightService tequilaFlightService;

    //TODO
    // exposed endpoint. not necessary in use until you want to expose this to the world :D
    @GetMapping
    @RequestMapping(value = "/getFlights", produces = "application/json", consumes = "application/json")
    public @ResponseBody
    HttpResponse getFlights(@RequestBody String dummy) throws IOException, InterruptedException {

        FlightQueryParam flightQueryParam = FlightQueryParam.builder()
                .flyFrom("IAS")
                .dateFrom("30/11/2023")
                .dateTo("30/11/2023")
                .build();

        return (HttpResponse) tequilaFlightService.sendTequilaSearchRequest(flightQueryParam).body();
    }
}
