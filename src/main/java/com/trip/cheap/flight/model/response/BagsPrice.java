package com.trip.cheap.flight.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BagsPrice {
    @JsonProperty("1")
    private double bag1;

    @JsonProperty("2")
    private double bag2;
}