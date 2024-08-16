package com.example.daedong_dayt.domain.auth.dto.request;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RegisterRequest {

    private String username;


    private String password;

    @Column(length = 4)
    private String name;

    @Column(length = 255)
    private String introduce;

}
