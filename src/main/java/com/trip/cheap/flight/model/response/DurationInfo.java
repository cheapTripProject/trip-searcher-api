package com.trip.cheap.flight.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DurationInfo {

    @JsonProperty("departure")
    private int departure;

    @JsonProperty("return")
    private int returnDuration;

    @JsonProperty("total")
    private int total;
}
