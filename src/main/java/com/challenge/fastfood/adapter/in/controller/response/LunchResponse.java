package com.challenge.fastfood.adapter.in.controller.response;

import com.challenge.fastfood.adapter.out.repository.LunchItemEntity;
import com.challenge.fastfood.domain.entities.Client;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

public record LunchResponse(

        @Schema(description = "The details for the snack of the lunch")
        List<LunchItemEntity> lunchItems,
        String status,
        @Schema(description = "The client CPF", example = "111.111.111-11")
        String cpf,
        @Schema(description = "The total price", example = "142.34")
        Float priceTotal,
        @Schema(description = "The number of the lunch", example = "1")
        Long numberLunch
        ) {
}
