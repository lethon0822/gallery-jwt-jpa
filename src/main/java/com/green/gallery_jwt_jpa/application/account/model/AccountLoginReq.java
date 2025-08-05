package com.green.gallery_jwt_jpa.application.account.model;

import lombok.Getter;

@Getter
public class AccountLoginReq {
    private String loginId;
    private String loginPw;
}
