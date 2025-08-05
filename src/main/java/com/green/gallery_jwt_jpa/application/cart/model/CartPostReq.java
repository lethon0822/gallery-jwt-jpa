package com.green.gallery_jwt_jpa.application.cart.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartPostReq {
    private long memberId;
    private long itemId;
}
