package com.example.daedong_dayt.domain.user.dto.Request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UpdateMyInfoRequest {

    private String username;

    private String password;

    private String name;

    private String introduce;


}
