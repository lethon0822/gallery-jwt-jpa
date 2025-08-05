package com.green.gallery_jwt_jpa.application.cart;

import com.green.gallery_jwt_jpa.application.cart.model.CartDeleteReq;
import com.green.gallery_jwt_jpa.application.cart.model.CartGetRes;
import com.green.gallery_jwt_jpa.application.cart.model.CartPostReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {
    int save(CartPostReq req);
    List<CartGetRes> findAllWithItemByMemberId(long memberId);
    int deleteByCartIdAndMemberId(CartDeleteReq req);
    int deleteByMemberId(long memberId);
}
