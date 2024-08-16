package com.example.daedong_dayt.domain.user.exception;

import com.example.daedong_dayt.global.error.exception.DayException;
import com.example.daedong_dayt.global.error.exception.ErrorCode;

public class UserMismatchException extends DayException {

    public static final DayException EXCEPTION = new UserMismatchException();

    public UserMismatchException(){
        super(ErrorCode.USER_MISMATCH);
    }
}
