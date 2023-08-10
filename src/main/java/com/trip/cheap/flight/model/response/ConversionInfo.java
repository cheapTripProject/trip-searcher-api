package com.trip.cheap.flight.model.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ConversionInfo {

    private Map <String, Double> currencyConversions = new HashMap <>();;

    @JsonAnyGetter
    public Map <String, Double> getCurrencyConversions() {
        return currencyConversions;
    }

    @JsonAnySetter
    public void setCurrencyConversions(String currency, Double value) {
        currencyConversions.put(currency, value);
    }
}
