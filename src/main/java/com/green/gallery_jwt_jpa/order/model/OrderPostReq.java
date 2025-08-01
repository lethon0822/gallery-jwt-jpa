package com.green.gallery_jwt_jpa.order.model;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class OrderPostReq {
    private String name;
    private String address;
    private String payment;
    private String cardNumber;
    private List<Integer> itemIds;
}
