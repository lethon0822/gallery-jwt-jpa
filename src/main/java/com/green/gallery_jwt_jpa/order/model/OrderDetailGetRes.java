package com.green.gallery_jwt_jpa.order.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class OrderDetailGetRes {
    private int id;
    private String name;
    private String address;
    private String payment;
    private long amount;
    private String created;
    private List<OrderDetailDto> items;
}
