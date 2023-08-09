package com.trip.cheap.flight.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Cabins {
    ECONOMY("M"),
    ECONOMY_PREMIUM("W"),
    BUSINESS("C"),
    FIRST_CLASS("F");

    @Getter
    private String cabinClass;
}
