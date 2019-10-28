package com.polovnev.structural.facade;

public class Main {

    public static void main(String[] args) {
        Facade facade = new FacadeImpl();
        facade.plusOperation(3, 5);
    }
}
