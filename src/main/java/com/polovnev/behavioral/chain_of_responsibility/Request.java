package com.polovnev.behavioral.chain_of_responsibility;

public class Request {

    private String message;
    private boolean isUpperCase;

    public Request(String message, boolean isUpperCase) {
        this.message = message;
        this.isUpperCase = isUpperCase;
    }

    public String getMessage() {
        return message;
    }


    public boolean isUpperCase() {
        return isUpperCase;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUpperCase(boolean upperCase) {
        isUpperCase = upperCase;
    }
}
