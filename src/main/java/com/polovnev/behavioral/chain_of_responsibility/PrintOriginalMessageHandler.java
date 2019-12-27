package com.polovnev.behavioral.chain_of_responsibility;

public class PrintOriginalMessageHandler extends BaseHandler {

    public PrintOriginalMessageHandler(Handler nextHandler) {
        super(nextHandler);
    }

    public PrintOriginalMessageHandler() {
    }

    @Override
    public void handle(Request request) {
        if(!request.isUpperCase()) {
            System.out.println(request.getMessage());
        } else {
            getNextHandler().handle(request);
        }
    }
}
