package com.trip.cheap.flight;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Log4j2
@Controller
public class FlightController {

    @GetMapping
    @RequestMapping(value = "/getFlights", produces = "application/json", consumes = "application/json")
    public @ResponseBody
    ResponseEntity<String> crawlProject(@RequestBody String dummy) {
     return ResponseEntity.ok("gg");
    }
}
