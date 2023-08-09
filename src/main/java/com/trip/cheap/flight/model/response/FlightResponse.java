package com.trip.cheap.flight.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.trip.cheap.flight.model.request.Currency;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class FlightResponse {

    @JsonProperty("search_id")
    private String searchId;

    @JsonProperty("currency")
    private Currency currency;

    @JsonProperty("fx_rate")
    private Double fxRate;

    @JsonProperty("data")
    private List <Data> data;
}
