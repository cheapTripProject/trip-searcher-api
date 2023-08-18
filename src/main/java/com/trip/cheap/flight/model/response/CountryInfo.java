package com.trip.cheap.flight.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CountryInfo {
    @JsonProperty("code")
    private String code;

    @JsonProperty("name")
    private String name;
}
