package com.trip.cheap.flight.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AvailabilityInfo {
    @JsonProperty("seats")
    private int seats;
}
