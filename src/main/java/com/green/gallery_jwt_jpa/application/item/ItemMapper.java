package com.green.gallery_jwt_jpa.application.item;


import com.green.gallery_jwt_jpa.application.item.model.ItemGetRes;
import com.green.gallery_jwt_jpa.application.item.model.ItemPostReq;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
    int save(ItemPostReq req);
    List<ItemGetRes> findAllByIdIn(List<Integer> ids);
}
