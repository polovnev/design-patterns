package com.polovnev.behavioral.chain_of_responsibility;

public class AddSmileToMessageHandler extends BaseHandler {

    public AddSmileToMessageHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        request.setMessage(request.getMessage() + ": )");
        getNextHandler().handle(request);
    }
}
