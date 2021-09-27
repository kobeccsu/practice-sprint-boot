package com.leizhou.exceptions;

public class LoginFailureException extends Exception{

    public LoginFailureException(String message){
        super(message);
    }
}
