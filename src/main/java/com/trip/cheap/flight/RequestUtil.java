package com.trip.cheap.flight;

import static java.util.Objects.requireNonNull;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ObjectUtils;

public class RequestUtil {

    @Value("${baseUrl}")
    private static String baseUrl;

    public static String resolveRequest(FlightQueryParam queryParam) {
        //TODO: resolve NPE checking each value to be != null
        return new StringBuilder()
                .append(baseUrl)
                .append(queryParam.getFlyFrom() != null
                        ? queryParam.getFlyFrom().isEmpty()
                        ? "fly_from=" + queryParam.getFlyFrom() + "&"
                        : ""
                        : "")
                .append(queryParam.getFlyTo() != null
                        ? queryParam.getFlyTo().isEmpty()
                        ? "fly_to=" + queryParam.getFlyTo() + "&"
                        : ""
                        : "")
                .append(queryParam.getDateFrom().isEmpty()
                        ? "date_from=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(queryParam.getDateTo().isEmpty()
                        ? "date_to=" + queryParam.getDateTo() + "&"
                        : "")
                .append(queryParam.getReturnFrom().isEmpty()
                        ? "return_from=" + queryParam.getReturnFrom() + "&"
                        : "")
                .append(queryParam.getReturnTo().isEmpty()
                        ? "return_to=" + queryParam.getReturnTo() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getNightsInDstFrom())
                        ? "nights_in_dst_from=" + queryParam.getNightsInDstFrom() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getNightsInDstTo())
                        ? "nights_in_dst_to=" + queryParam.getNightsInDstTo() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getMaxFlyDuration())
                        ? "max_fly_duration=" + queryParam.getMaxFlyDuration() + "&"
                        : "")
                .append("ret_from_diff_city=" + queryParam.isRetFromDiffCity() + "&")
                .append("ret_to_diff_city=" + queryParam.getFlyFrom() + "&")
                .append(ObjectUtils.isEmpty(queryParam.getOneForCity())
                        ? "one_for_city=" + queryParam.getOneForCity() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getOnePerDate())
                        ? "one_per_date=" + queryParam.getOnePerDate() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getAdults())
                        ? "adults=" + queryParam.getAdults() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getChildren())
                        ? "children=" + queryParam.getChildren() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getInfants())
                        ? "infants=" + queryParam.getInfants() + "&"
                        : "")
                .append(queryParam.getSelectedCabins().isEmpty()
                        ? "selected_cabins=" + queryParam.getSelectedCabins() + "&"
                        : "")
                .append(queryParam.getMixWithCabins().isEmpty()
                        ? "mix_with_cabins=" + queryParam.getMixWithCabins() + "&"
                        : "")
                .append(queryParam.getAdultHoldBag().isEmpty()
                        ? "adult_hold_bag=" + queryParam.getAdultHoldBag() + "&"
                        : "")
                .append(queryParam.getAdultHandBag().isEmpty()
                        ? "adult_hand_bag=" + queryParam.getAdultHandBag() + "&"
                        : "")
                .append(queryParam.getChildHoldBag().isEmpty()
                        ? "child_hold_bag=" + queryParam.getChildHoldBag() + "&"
                        : "")
                .append(queryParam.getChildHandBag().isEmpty()
                        ? "child_hand_bag=" + queryParam.getChildHandBag() + "&"
                        : "")
                .append(queryParam.getFlyDays().isEmpty()
                        ? "fly_days=" + queryParam.getFlyDays() + "&"
                        : "")
                .append(queryParam.getFlyDaysType().isEmpty()
                        ? "fly_days_type=" + queryParam.getFlyDaysType() + "&"
                        : "")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "ret_fly_days=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(queryParam.getRetFlyDaysType().isEmpty()
                        ? "ret_fly_days_type=" + queryParam.getRetFlyDaysType() + "&"
                        : "")
                .append("only_working_days=" + queryParam.isOnlyWorkingDays() + "&")
                .append("only_weekends=" + queryParam.isOnlyWeekends() + "&")
                .append(queryParam.getPartnerMarket().isEmpty()
                        ? "partner_market=" + queryParam.getPartnerMarket() + "&"
                        : "")
                .append(queryParam.getCurr().isEmpty()
                        ? "curr=" + queryParam.getCurr() + "&"
                        : "")
                .append(queryParam.getLocale().isEmpty()
                        ? "locale=" + queryParam.getLocale() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getPriceFrom())
                        ? "price_from=" + queryParam.getPriceFrom() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getPriceTo())
                        ? "price_to=" + queryParam.getPriceTo() + "&"
                        : "")
                .append(queryParam.getDtimeFrom().isEmpty()
                        ? "dtime_from=" + queryParam.getDtimeFrom() + "&"
                        : "")
                .append(queryParam.getDtimeTo().isEmpty()
                        ? "dtime_to=" + queryParam.getDtimeTo() + "&"
                        : "")
                .append(queryParam.getAtimeFrom().isEmpty()
                        ? "atime_from=" + queryParam.getAtimeFrom() + "&"
                        : "")
                .append(queryParam.getAtimeTo().isEmpty()
                        ? "atime_to=" + queryParam.getAtimeTo() + "&"
                        : "")
                .append(queryParam.getRetDtimeFrom().isEmpty()
                        ? "ret_dtime_from=" + queryParam.getRetDtimeFrom() + "&"
                        : "")
                .append(queryParam.getRetDtimeTo().isEmpty()
                        ? "ret_dtime_to=" + queryParam.getRetDtimeTo() + "&"
                        : "")
                .append(queryParam.getRetAtimeFrom().isEmpty()
                        ? "ret_atime_from=" + queryParam.getRetAtimeFrom() + "&"
                        : "")
                .append(queryParam.getRetAtimeTo().isEmpty()
                        ? "ret_atime_to=" + queryParam.getRetAtimeTo() + "&"
                        : "")
                .append(queryParam.getStopOverFrom().isEmpty()
                        ? "stopover_from=" + queryParam.getStopOverFrom() + "&"
                        : "")
                .append(queryParam.getStopOverTo().isEmpty()
                        ? "stopover_to=" + queryParam.getStopOverTo() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getMaxStopOvers())
                        ? "max_stopovers=" + queryParam.getMaxStopOvers() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getMaxSectorStopOvers())
                        ? "max_sector_stopovers=" + queryParam.getMaxSectorStopOvers() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getConnOnDiffAirport())
                        ? "conn_on_diff_airport=" + queryParam.getConnOnDiffAirport() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getRetFromDiffAirport())
                        ? "ret_from_diff_airport=" + queryParam.getRetFromDiffAirport() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getRetToDiffAirport())
                        ? "ret_to_diff_airport=" + queryParam.getRetToDiffAirport() + "&"
                        : "")
                .append(queryParam.getSelectAirlines().isEmpty()
                        ? "select_airlines=" + queryParam.getSelectAirlines() + "&"
                        : "")
                .append("select_airlines_exclude=" + queryParam.isSelectAirlinesExcluded() + "&")
                .append(queryParam.getSelectStopAirport().isEmpty()
                        ? "select_stop_airport=" + queryParam.getSelectStopAirport() + "&"
                        : "")
                .append("select_stop_airport_exclude=" + queryParam.isSelectStopAirportExclude() + "&")
                .append(queryParam.getVehicleType().isEmpty()
                        ? "vehicle_type=" + queryParam.getVehicleType() + "&"
                        : "")
                .append("enable_vi=" + queryParam.isEnableVi() + "&")
                .append(queryParam.getSort().isEmpty()
                        ? "sort=" + queryParam.getSort() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getLimit())
                        ? "limit=" + queryParam.getLimit() + "&"
                        : "")
                .toString();
    }

}
