package com.assignment.myphotoapp.exceptions;

public class RestrictedInfoException extends Exception{

    @Override
    public String getMessage(){
        return "Username is unavailable...";
    }
}
