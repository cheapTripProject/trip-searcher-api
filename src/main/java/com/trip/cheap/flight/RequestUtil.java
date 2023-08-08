package com.trip.cheap.flight;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ObjectUtils;

public class RequestUtil {

    @Value("${baseUrl}")
    private String baseUrl;

    public String resolveRequest(FlightQueryParam queryParam) {

        return new StringBuilder()
                .append(baseUrl)
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "fly_from=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(queryParam.getFlyTo().isEmpty()
                        ? "fly_to=" + queryParam.getFlyTo() + "&"
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
                .append(ObjectUtils.isEmpty(queryParam.getDateFrom())
                        ? "one_for_city=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getFlyFrom())
                        ? "one_per_date=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getDateFrom())
                        ? "adults=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getFlyFrom())
                        ? "children=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getDateFrom())
                        ? "infants=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "selected_cabins=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(queryParam.getDateFrom().isEmpty()
                        ? "mix_with_cabins=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "adult_hold_bag=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(queryParam.getDateFrom().isEmpty()
                        ? "adult_hand_bag=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "child_hold_bag=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(queryParam.getDateFrom().isEmpty()
                        ? "child_hand_bag=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "fly_days=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(queryParam.getDateFrom().isEmpty()
                        ? "fly_days_type=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "ret_fly_days=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(queryParam.getDateFrom().isEmpty()
                        ? "ret_fly_days_type=" + queryParam.getDateFrom() + "&"
                        : "")
                .append("only_working_days=" + queryParam.getFlyFrom() + "&")
                .append("only_weekends=" + queryParam.getDateFrom() + "&")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "partner_market=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(queryParam.getDateFrom().isEmpty()
                        ? "curr=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "locale=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getDateFrom())
                        ? "price_from=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getFlyFrom())
                        ? "price_to=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(queryParam.getDateFrom().isEmpty()
                        ? "dtime_from=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "dtime_to=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(queryParam.getDateFrom().isEmpty()
                        ? "atime_from=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "atime_to=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(queryParam.getDateFrom().isEmpty()
                        ? "ret_dtime_from=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "ret_dtime_to=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(queryParam.getDateFrom().isEmpty()
                        ? "ret_atime_from=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "ret_atime_to=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(queryParam.getDateFrom().isEmpty()
                        ? "stopover_from=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "stopover_to=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getDateFrom())
                        ? "max_stopovers=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getFlyFrom())
                        ? "max_sector_stopovers=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getDateFrom())
                        ? "conn_on_diff_airport=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getFlyFrom())
                        ? "ret_from_diff_airport=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getDateFrom())
                        ? "ret_to_diff_airport=" + queryParam.getDateFrom() + "&"
                        : "")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "select_airlines=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append("select_airlines_exclude=" + queryParam.getDateFrom() + "&")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "select_stop_airport=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append("select_stop_airport_exclude=" + queryParam.getDateFrom() + "&")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "vehicle_type=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append("enable_vi=" + queryParam.getDateFrom() + "&")
                .append(queryParam.getFlyFrom().isEmpty()
                        ? "sort=" + queryParam.getFlyFrom() + "&"
                        : "")
                .append(ObjectUtils.isEmpty(queryParam.getDateFrom())
                        ? "limit=" + queryParam.getDateFrom() + "&"
                        : "")
                .toString();
    }

}
