package com.polovnev.behavioral.chain_of_responsibility;

public class Main {

    public static void main(String[] args) {
        Request requestOriginalCase = new Request("Hello Original Handler!",false);
        new PrintOriginalMessageHandler(new PrintUpperCaseMessageHandler()).handle(requestOriginalCase);
        Request requestUpperCase = new Request("Hello Upper Handler!",true);
        new PrintOriginalMessageHandler(new PrintUpperCaseMessageHandler()).handle(requestUpperCase);
        Request requestUpperCaseWithSmile = new Request("Hello with smile in upper case ",true);
        new AddSmileToMessageHandler(new PrintOriginalMessageHandler(new PrintUpperCaseMessageHandler())).handle(requestUpperCaseWithSmile);

    }
}
