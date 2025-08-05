package com.green.gallery_jwt_jpa.application.account.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AccountJoinReq {
    private String name;
    private String loginId;
    private String loginPw;
}
