package com.trip.cheap.flight.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FareInfo {
    @JsonProperty("adults")
    private int adults;

    @JsonProperty("children")
    private int children;

    @JsonProperty("infants")
    private int infants;
}
