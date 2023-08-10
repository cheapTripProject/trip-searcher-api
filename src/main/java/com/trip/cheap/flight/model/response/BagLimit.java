package com.trip.cheap.flight.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
public class BagLimit {
    @JsonProperty("hand_height")
    private int handHeight;

    @JsonProperty("hand_length")
    private int handLength;

    @JsonProperty("hand_weight")
    private int handWeight;

    @JsonProperty("hand_width")
    private int handWidth;

    @JsonProperty("hold_dimensions_sum")
    private int holdDimensionsSum;

    @JsonProperty("hold_height")
    private int holdHeight;

    @JsonProperty("hold_length")
    private int holdLength;

    @JsonProperty("hold_weight")
    private int holdWeight;

    @JsonProperty("hold_width")
    private int holdWidth;

    @JsonProperty("personal_item_height")
    private int personalItemHeight;

    @JsonProperty("personal_item_length")
    private int personalItemLength;

    @JsonProperty("personal_item_weight")
    private int personalItemWeight;

    @JsonProperty("personal_item_width")
    private int personalItemWidth;
}
