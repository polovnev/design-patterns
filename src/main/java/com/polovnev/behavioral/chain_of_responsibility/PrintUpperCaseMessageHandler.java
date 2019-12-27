package com.polovnev.behavioral.chain_of_responsibility;

public class PrintUpperCaseMessageHandler extends BaseHandler{

    public PrintUpperCaseMessageHandler(Handler nextHandler) {
        super(nextHandler);
    }

    public PrintUpperCaseMessageHandler() {
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getMessage().toUpperCase());
    }
}
