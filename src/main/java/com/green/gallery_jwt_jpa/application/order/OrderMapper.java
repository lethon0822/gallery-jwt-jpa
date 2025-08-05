package com.green.gallery_jwt_jpa.application.order;


import com.green.gallery_jwt_jpa.application.order.model.OrderDetailGetReq;
import com.green.gallery_jwt_jpa.application.order.model.OrderDetailGetRes;
import com.green.gallery_jwt_jpa.application.order.model.OrderGetRes;
import com.green.gallery_jwt_jpa.application.order.model.OrderPostDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    int save(OrderPostDto dto);
    List<OrderGetRes> findAllByMemberIdOrderByIdDesc(long memberId);
    OrderDetailGetRes findByOrderIdAndMemberId(OrderDetailGetReq req);
}
