package com.polovnev.behavioral.chain_of_responsibility;

public abstract class BaseHandler implements Handler{

    private Handler nextHandler;

    public BaseHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public BaseHandler() {
    }

    public Handler getNextHandler() {
        return nextHandler;
    }


}
