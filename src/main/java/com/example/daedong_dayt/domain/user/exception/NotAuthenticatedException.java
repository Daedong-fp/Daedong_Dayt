package com.example.daedong_dayt.domain.user.exception;

public class NotAuthenticatedException extends RuntimeException{

    public NotAuthenticatedException(String message){
        super(message);
    }
}
