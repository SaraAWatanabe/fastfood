package com.challenge.fastfood.adapter.in.controller.response;

import com.challenge.fastfood.domain.entities.LunchItemType;
import io.swagger.v3.oas.annotations.media.Schema;

public record LunchItemResponse(
    @Schema(description = "The name of the lunch item", example = "Hamburger")
    String name,
    @Schema(description = "The price of the lunch item", example = "1.42")
    float price,
    @Schema(description = "The type of the lunch item", example = "Snack")
    LunchItemType type) {
}
