package com.example.daedong_dayt.domain.auth.exception;

import com.example.daedong_dayt.global.error.exception.DayException;
import com.example.daedong_dayt.global.error.exception.ErrorCode;

public class UserAlreadyTaken extends DayException {

    public static final DayException EXCEPTION = new UserAlreadyTaken();

    private UserAlreadyTaken(){
        super(ErrorCode.USER_ALREADY_TAKEN);
    }
}
