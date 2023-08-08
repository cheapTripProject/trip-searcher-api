package com.trip.cheap.flight;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class FlightQueryParam {

    private String flyFrom;

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

    private boolean retFromDiffCity;

    private boolean retToDiffCity;

    private Integer oneForCity;

    private Integer onePerDate;

    private Integer adults;

    private Integer children;

    private Integer infants;

    private String selectedCabins;

    private String mixWithCabins;

    private String adultHoldBag;

    private String adultHandBag;

    private String childHoldBag;

    private String childHandBag;

    private String flyDays;

    private String flyDaysType;

    private String retFlyDaysType;

    private boolean onlyWorkingDays;

    private boolean onlyWeekends;

    private String partnerMarket;

    private String curr;

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

    private boolean selectAirlinesExcluded;

    private String selectStopAirport;

    private boolean selectStopAirportExclude;

    private String vehicleType;

    private boolean enableVi;

    private String sort;

    private Integer limit;
}
