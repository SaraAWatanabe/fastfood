package com.challenge.fastfood.adapter.out.mapstruct;

import com.challenge.fastfood.adapter.in.controller.request.LunchItemRequest;
import com.challenge.fastfood.adapter.in.controller.response.LunchItemResponse;
import com.challenge.fastfood.adapter.out.repository.LunchItemEntity;
import com.challenge.fastfood.domain.entities.LunchItem;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LunchItemMapper {

    LunchItem lunchItemRequestToLunchItem(LunchItemRequest lunchItemRequest);

    LunchItemResponse lunchItemToLunchItemResponse(LunchItem lunchItem);
    List<LunchItemResponse> lunchItemToLunchItemResponse(List<LunchItem> lunchItems);

    LunchItemEntity lunchItemToLunchItemEntity(LunchItem lunchItem);
    List<LunchItemEntity> lunchItemToLunchItemEntity(List<LunchItem> lunchItems);

    LunchItem lunchItemEntityToLunchItem(LunchItemEntity lunchItemEntity);
    List<LunchItem> lunchItemEntityToLunchItem(List<LunchItemEntity> lunchItemEntities);


}
