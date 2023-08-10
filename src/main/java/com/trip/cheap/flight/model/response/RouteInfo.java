package com.trip.cheap.flight.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RouteInfo {
    @JsonProperty("id")
    private String id;

    @JsonProperty("combination_id")
    private String combinationId;

    @JsonProperty("flyFrom")
    private String flyFrom;

    @JsonProperty("flyTo")
    private String flyTo;

    @JsonProperty("cityFrom")
    private String cityFrom;

    @JsonProperty("cityCodeFrom")
    private String cityCodeFrom;

    @JsonProperty("cityTo")
    private String cityTo;

    @JsonProperty("cityCodeTo")
    private String cityCodeTo;

    @JsonProperty("local_departure")
    private String localDeparture;

    @JsonProperty("utc_departure")
    private String utcDeparture;

    @JsonProperty("local_arrival")
    private String localArrival;

    @JsonProperty("utc_arrival")
    private String utcArrival;

    @JsonProperty("airline")
    private String airline;

    @JsonProperty("flight_no")
    private int flightNo;

    @JsonProperty("operating_carrier")
    private String operatingCarrier;

    @JsonProperty("operating_flight_no")
    private String operatingFlightNo;

    @JsonProperty("fare_basis")
    private String fareBasis;

    @JsonProperty("fare_category")
    private String fareCategory;

    @JsonProperty("fare_classes")
    private String fareClasses;

    @JsonProperty("fare_family")
    private String fareFamily;

    @JsonProperty("return")
    private int returnFlight;

    @JsonProperty("bags_recheck_required")
    private boolean bagsRecheckRequired;

    @JsonProperty("vi_connection")
    private boolean viConnection;

    @JsonProperty("guarantee")
    private boolean guarantee;

    @JsonProperty("equipment")
    private Object equipment;

    @JsonProperty("vehicle_type")
    private String vehicleType;
}
