package com.trip.cheap.flight;

import com.trip.cheap.flight.model.request.Currency;
import com.trip.cheap.flight.model.request.FlightQueryParam;
import com.trip.cheap.flight.model.response.FlightResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

import static com.trip.cheap.flight.model.request.Cabins.ECONOMY;
import static com.trip.cheap.flight.model.request.Sort.PRICE;

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
    FlightResponse getFlights(@RequestBody FlightQueryParam flightQueryParam) throws IOException, InterruptedException {

        flightQueryParam.setBaseUrl(baseUrl);
        log.debug(flightQueryParam.toString());

        // just for testing purpose
        FlightQueryParam flightQueryParamTest =
            FlightQueryParam.builder()
                            .baseUrl(baseUrl)
                            .flyFrom("IAS")
                            .selectedCabins(ECONOMY.getCabinClass())
                            .curr(Currency.RON)
                            .sort(PRICE.getSortCriteria())
                            .dateFrom("30/11/2023")
                            .dateTo("30/11/2023")
                            .build();

        return tequilaFlightService.sendTequilaSearchRequest(flightQueryParam);
    }
}
