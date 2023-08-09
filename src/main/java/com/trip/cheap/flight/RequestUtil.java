package com.trip.cheap.flight;

import com.trip.cheap.flight.model.request.FlightQueryParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ObjectUtils;

@Slf4j
public class RequestUtil {

    public static String resolveRequest(FlightQueryParam queryParam) {
        log.debug("resolve queryParam object: " + queryParam.toString() );
        return StringUtils.chop(new StringBuilder()
            .append(queryParam.getBaseUrl())
            .append(queryParam.getFlyFrom() != null
                ? !queryParam.getFlyFrom().isEmpty()
                ? "fly_from=" + queryParam.getFlyFrom() + "&"
                : ""
                : "")
            .append(queryParam.getFlyTo() != null
                ? !queryParam.getFlyTo().isEmpty()
                ? "fly_to=" + queryParam.getFlyTo() + "&"
                : ""
                : "")
            .append(queryParam.getDateFrom() != null
                ? !queryParam.getDateFrom().isEmpty()
                ? "date_from=" + queryParam.getDateFrom() + "&"
                : ""
                : "")
            .append(queryParam.getDateTo() != null
                ? !queryParam.getDateTo().isEmpty()
                ? "date_to=" + queryParam.getDateTo() + "&"
                : ""
                : "")
            .append(queryParam.getReturnFrom() != null
                ? !queryParam.getReturnFrom().isEmpty()
                ? "return_from=" + queryParam.getReturnFrom() + "&"
                : ""
                : "")
            .append(queryParam.getReturnTo() != null
                ? !queryParam.getReturnTo().isEmpty()
                ? "return_to=" + queryParam.getReturnTo() + "&"
                : ""
                : "")
            .append(queryParam.getNightsInDstFrom() != null
                ? !ObjectUtils.isEmpty(queryParam.getNightsInDstFrom())
                ? "nights_in_dst_from=" + queryParam.getNightsInDstFrom() + "&"
                : ""
                : "")
            .append(queryParam.getNightsInDstTo() != null
                ? !ObjectUtils.isEmpty(queryParam.getNightsInDstTo())
                ? "nights_in_dst_to=" + queryParam.getNightsInDstTo() + "&"
                : ""
                : "")
            .append(queryParam.getMaxFlyDuration() != null
                ? !ObjectUtils.isEmpty(queryParam.getMaxFlyDuration())
                ? "max_fly_duration=" + queryParam.getMaxFlyDuration() + "&"
                : ""
                : "")
            .append("ret_from_diff_city=" + queryParam.isRetFromDiffCity() + "&")
            .append("ret_to_diff_city=" + queryParam.isRetToDiffCity() + "&")
            .append(queryParam.getOneForCity() != null
                ? !ObjectUtils.isEmpty(queryParam.getOneForCity())
                ? "one_for_city=" + queryParam.getOneForCity() + "&"
                : ""
                : "")
            .append(queryParam.getOnePerDate() != null
                ? !ObjectUtils.isEmpty(queryParam.getOnePerDate())
                ? "one_per_date=" + queryParam.getOnePerDate() + "&"
                : ""
                : "")
            .append(queryParam.getAdults() != null
                ? !ObjectUtils.isEmpty(queryParam.getAdults())
                ? "adults=" + queryParam.getAdults() + "&"
                : ""
                : "")
            .append(queryParam.getChildren() != null
                ? !ObjectUtils.isEmpty(queryParam.getChildren())
                ? "children=" + queryParam.getChildren() + "&"
                : ""
                : "")
            .append(queryParam.getInfants() != null
                ? !ObjectUtils.isEmpty(queryParam.getInfants())
                ? "infants=" + queryParam.getInfants() + "&"
                : ""
                : "")
            .append(queryParam.getSelectedCabins() != null
                ? !queryParam.getSelectedCabins().isEmpty()
                ? "selected_cabins=" + queryParam.getSelectedCabins() + "&"
                : ""
                : "")
            .append(queryParam.getMixWithCabins() != null
                ? !queryParam.getMixWithCabins().isEmpty()
                ? "mix_with_cabins=" + queryParam.getMixWithCabins() + "&"
                : ""
                : "")
            .append(queryParam.getAdultHoldBag() != null
                ? !queryParam.getAdultHoldBag().isEmpty()
                ? "adult_hold_bag=" + queryParam.getAdultHoldBag() + "&"
                : ""
                : "")
            .append(queryParam.getAdultHandBag() != null
                ? !queryParam.getAdultHandBag().isEmpty()
                ? "adult_hand_bag=" + queryParam.getAdultHandBag() + "&"
                : ""
                : "")
            .append(queryParam.getChildHoldBag() != null
                ? !queryParam.getChildHoldBag().isEmpty()
                ? "child_hold_bag=" + queryParam.getChildHoldBag() + "&"
                : ""
                : "")
            .append(queryParam.getChildHandBag() != null
                ? !queryParam.getChildHandBag().isEmpty()
                ? "child_hand_bag=" + queryParam.getChildHandBag() + "&"
                : ""
                : "")
            .append(queryParam.getFlyDays() != null
                ? !queryParam.getFlyDays().isEmpty()
                ? "fly_days=" + queryParam.getFlyDays() + "&"
                : ""
                : "")
            .append(queryParam.getFlyDaysType() != null
                ? !queryParam.getFlyDaysType().isEmpty()
                ? "fly_days_type=" + queryParam.getFlyDaysType() + "&"
                : ""
                : "")
            .append(queryParam.getFlyDays() != null
                ? !queryParam.getFlyDays().isEmpty()
                ? "ret_fly_days=" + queryParam.getFlyDays() + "&"
                : ""
                : "")
            .append(queryParam.getRetFlyDaysType() != null
                ? !queryParam.getRetFlyDaysType().isEmpty()
                ? "ret_fly_days_type=" + queryParam.getRetFlyDaysType() + "&"
                : ""
                : "")
            .append("only_working_days=" + queryParam.isOnlyWorkingDays() + "&")
            .append("only_weekends=" + queryParam.isOnlyWeekends() + "&")
            .append(queryParam.getPartnerMarket() != null
                ? !queryParam.getPartnerMarket().isEmpty()
                ? "partner_market=" + queryParam.getPartnerMarket() + "&"
                : ""
                : "")
            .append(queryParam.getCurr() != null
                ?  "curr=" + queryParam.getCurr() + "&"
                : "")
            .append(queryParam.getLocale() != null
                ? !queryParam.getLocale().isEmpty()
                ? "locale=" + queryParam.getLocale() + "&"
                : ""
                : "")
            .append(queryParam.getPriceFrom() != null
                ? !ObjectUtils.isEmpty(queryParam.getPriceFrom())
                ? "price_from=" + queryParam.getPriceFrom() + "&"
                : ""
                : "")
            .append(queryParam.getPriceTo() != null
                ? !ObjectUtils.isEmpty(queryParam.getPriceTo())
                ? "price_to=" + queryParam.getPriceTo() + "&"
                : ""
                : "")
            .append(queryParam.getDtimeFrom() != null
                ? !queryParam.getDtimeFrom().isEmpty()
                ? "dtime_from=" + queryParam.getDtimeFrom() + "&"
                : ""
                : "")
            .append(queryParam.getDtimeTo() != null
                ? !queryParam.getDtimeTo().isEmpty()
                ? "dtime_to=" + queryParam.getDtimeTo() + "&"
                : ""
                : "")
            .append(queryParam.getAtimeFrom() != null
                ? !queryParam.getAtimeFrom().isEmpty()
                ? "atime_from=" + queryParam.getAtimeFrom() + "&"
                : ""
                : "")
            .append(queryParam.getAtimeTo() != null
                ? !queryParam.getAtimeTo().isEmpty()
                ? "atime_to=" + queryParam.getAtimeTo() + "&"
                : ""
                : "")
            .append(queryParam.getRetDtimeFrom() != null
                ? !queryParam.getRetDtimeFrom().isEmpty()
                ? "ret_dtime_from=" + queryParam.getRetDtimeFrom() + "&"
                : ""
                : "")
            .append(queryParam.getRetDtimeTo() != null
                ? !queryParam.getRetDtimeTo().isEmpty()
                ? "ret_dtime_to=" + queryParam.getRetDtimeTo() + "&"
                : ""
                : "")
            .append(queryParam.getRetAtimeFrom() != null
                ? !queryParam.getRetAtimeFrom().isEmpty()
                ? "ret_atime_from=" + queryParam.getRetAtimeFrom() + "&"
                : ""
                : "")
            .append(queryParam.getRetAtimeTo() != null
                ? !queryParam.getRetAtimeTo().isEmpty()
                ? "ret_atime_to=" + queryParam.getRetAtimeTo() + "&"
                : ""
                : "")
            .append(queryParam.getStopOverFrom() != null
                ? !queryParam.getStopOverFrom().isEmpty()
                ? "stopover_from=" + queryParam.getStopOverFrom() + "&"
                : ""
                : "")
            .append(queryParam.getStopOverTo() != null
                ? !queryParam.getStopOverTo().isEmpty()
                ? "stopover_to=" + queryParam.getStopOverTo() + "&"
                : ""
                : "")
            .append(queryParam.getMaxStopOvers() != null
                ? !ObjectUtils.isEmpty(queryParam.getMaxStopOvers())
                ? "max_stopovers=" + queryParam.getMaxStopOvers() + "&"
                : ""
                : "")
            .append(queryParam.getMaxSectorStopOvers() != null
                ? !ObjectUtils.isEmpty(queryParam.getMaxSectorStopOvers())
                ? "max_sector_stopovers=" + queryParam.getMaxSectorStopOvers() + "&"
                : ""
                : "")
            .append(queryParam.getConnOnDiffAirport() != null
                ? !ObjectUtils.isEmpty(queryParam.getConnOnDiffAirport())
                ? "conn_on_diff_airport=" + queryParam.getConnOnDiffAirport() + "&"
                : ""
                : "")
            .append(queryParam.getRetFromDiffAirport() != null
                ? !ObjectUtils.isEmpty(queryParam.getRetFromDiffAirport())
                ? "ret_from_diff_airport=" + queryParam.getRetFromDiffAirport() + "&"
                : ""
                : "")
            .append(queryParam.getRetToDiffAirport() != null
                ? !ObjectUtils.isEmpty(queryParam.getRetToDiffAirport())
                ? "ret_to_diff_airport=" + queryParam.getRetToDiffAirport() + "&"
                : ""
                : "")
            .append(queryParam.getSelectAirlines() != null
                ? !queryParam.getSelectAirlines().isEmpty()
                ? "select_airlines=" + queryParam.getSelectAirlines() + "&"
                : ""
                : "")
            .append("select_airlines_exclude=" + queryParam.isSelectAirlinesExcluded() + "&")
            .append(queryParam.getSelectStopAirport() != null
                ? !queryParam.getSelectStopAirport().isEmpty()
                ? "select_stop_airport=" + queryParam.getSelectStopAirport() + "&"
                : ""
                : "")
            .append("select_stop_airport_exclude=" + queryParam.isSelectStopAirportExclude() + "&")
            .append(queryParam.getVehicleType() != null
                ? !queryParam.getVehicleType().isEmpty()
                ? "vehicle_type=" + queryParam.getVehicleType() + "&"
                : ""
                : "")
            .append("enable_vi=" + queryParam.isEnableVi() + "&")
            .append(queryParam.getSort() != null
                ? !queryParam.getSort().isEmpty()
                ? "sort=" + queryParam.getSort() + "&"
                : ""
                : "")
            .append(queryParam.getLimit() != null
                ? !ObjectUtils.isEmpty(queryParam.getLimit())
                ? "limit=" + queryParam.getLimit() + "&"
                : ""
                : "")
            .toString());
    }
}
