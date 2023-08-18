package com.trip.cheap.flight.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class FlightData {
    @JsonProperty("id")
    private String id;

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

    @JsonProperty("countryFrom")
    private CountryInfo countryFrom;

    @JsonProperty("countryTo")
    private CountryInfo countryTo;

    @JsonProperty("local_departure")
    private String localDeparture;

    @JsonProperty("utc_departure")
    private String utcDeparture;

    @JsonProperty("local_arrival")
    private String localArrival;

    @JsonProperty("utc_arrival")
    private String utcArrival;

    @JsonProperty("nightsInDest")
    private int nightsInDest;

    @JsonProperty("quality")
    private double quality;

    @JsonProperty("distance")
    private double distance;

    @JsonProperty("duration")
    private DurationInfo duration;

    @JsonProperty("price")
    private double price;

    @JsonProperty("conversion")
    private ConversionInfo conversion;

    @JsonProperty("fare")
    private FareInfo fare;

    @JsonProperty("bags_price")
    private BagsPrice bagsPrice;

    @JsonProperty("baglimit")
    private BagLimit bagLimit;

    @JsonProperty("availability")
    private AvailabilityInfo availability;

    @JsonProperty("airlines")
    private List <String> airlines;

    @JsonProperty("route")
    private List <RouteInfo> route;

    @JsonProperty("booking_token")
    private String bookingToken;

    @JsonProperty("deep_link")
    private String deepLink;

    @JsonProperty("facilitated_booking_available")
    private boolean facilitatedBookingAvailable;

    @JsonProperty("pnr_count")
    private int pnrCount;

    @JsonProperty("has_airport_change")
    private boolean hasAirportChange;

    @JsonProperty("technical_stops")
    private int technicalStops;

    @JsonProperty("throw_away_ticketing")
    private boolean throwAwayTicketing;

    @JsonProperty("hidden_city_ticketing")
    private boolean hiddenCityTicketing;

    @JsonProperty("virtual_interlining")
    private boolean virtualInterlining;
}
