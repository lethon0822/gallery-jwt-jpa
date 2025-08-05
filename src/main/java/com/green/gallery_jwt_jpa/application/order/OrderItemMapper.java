package com.green.gallery_jwt_jpa.application.order;

import com.green.gallery_jwt_jpa.application.order.model.OrderDetailDto;
import com.green.gallery_jwt_jpa.application.order.model.OrderItemPostDto;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderItemMapper {
    int save(OrderItemPostDto dto);
    List<OrderDetailDto> findAllByOrderId(int orderId);
}
