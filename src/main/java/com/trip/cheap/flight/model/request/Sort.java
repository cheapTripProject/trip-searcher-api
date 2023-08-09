package com.trip.cheap.flight.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Sort {
    PRICE("price"),
    QUALITY("quality"),
    DATE("date"),
    DURATION("duration");

    @Getter
    private String sortCriteria;
}
