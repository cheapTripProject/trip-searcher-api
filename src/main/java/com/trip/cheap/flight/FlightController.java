package com.trip.cheap.flight;

import com.trip.cheap.flight.model.FlightQueryParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Slf4j
@Controller
public class FlightController {

    @Autowired
    private TequilaFlightService tequilaFlightService;

    @Value("${baseUrl}")
    private String baseUrl;

    //TODO
    // exposed endpoint. not necessary in use until you want to expose this to the world :D
    @GetMapping
    @RequestMapping(value = "/getFlights", produces = "application/json", consumes = "application/json")
    public @ResponseBody
    String getFlights(@RequestBody String dummy) throws IOException, InterruptedException {

        FlightQueryParam flightQueryParam =
            FlightQueryParam.builder()
                            .baseUrl(baseUrl)
                            .flyFrom("IAS")
                            .dateFrom("30/11/2023")
                            .dateTo("30/11/2023")
                            .build();

        return tequilaFlightService.sendTequilaSearchRequest(flightQueryParam);
    }
}
