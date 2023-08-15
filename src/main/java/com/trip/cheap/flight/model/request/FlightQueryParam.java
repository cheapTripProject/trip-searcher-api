package com.trip.cheap.flight.model.request;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class FlightQueryParam {
    //TODO: set default values based on documentation

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Builder.Default
    private String baseUrl = "https://api.tequila.kiwi.com/v2/search?";

    @Builder.Default
    private String flyFrom = "30/11/2023";

    private String flyTo;

    // dd/mm/yyyy
    private String dateFrom;

    // dd/mm/yyyy
    private String dateTo;

    // dd/mm/yyyy
    private String returnFrom;

    // dd/mm/yyyy
    private String returnTo;

    private Integer nightsInDstFrom;

    private Integer nightsInDstTo;

    // duration in hours
    private Integer maxFlyDuration;

    @Builder.Default
    private boolean retFromDiffCity = false;

    @Builder.Default
    private boolean retToDiffCity = false;

    private Integer oneForCity;

    private Integer onePerDate;

    private Integer adults;

    private Integer children;

    private Integer infants;

    //Cabins enum
    private String selectedCabins;

    private String mixWithCabins;

    private String adultHoldBag;

    private String adultHandBag;

    private String childHoldBag;

    private String childHandBag;

    private String flyDays;

    private String flyDaysType;

    private String retFlyDaysType;

    @Builder.Default
    private boolean onlyWorkingDays = false;

    @Builder.Default
    private boolean onlyWeekends = false;

    private String partnerMarket;

    private Currency curr;

    private String locale;

    private Integer priceFrom;

    private Integer priceTo;

    private String dtimeFrom;

    private String dtimeTo;

    private String atimeFrom;

    private String atimeTo;

    private String retDtimeFrom;

    private String retDtimeTo;

    private String retAtimeFrom;

    private String retAtimeTo;

    private String stopOverFrom;

    private String stopOverTo;

    private Integer maxStopOvers;

    private Integer maxSectorStopOvers;

    private Integer connOnDiffAirport;

    private Integer retFromDiffAirport;

    private Integer retToDiffAirport;

    private String selectAirlines;

    @Builder.Default
    private boolean selectAirlinesExcluded = false;

    private String selectStopAirport;

    @Builder.Default
    private boolean selectStopAirportExclude = false;

    private String vehicleType;

    @Builder.Default
    private boolean enableVi = false;

    //Sort enum
    private String sort;

    private Integer limit;
}
