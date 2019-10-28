package com.polovnev.structural.facade;

public class FacadeImpl implements Facade {

    private Calculator calculator = new Calculator();

    private Logger logger = new Logger();

    public void plusOperation(int a, int b) {
        logger.logToConsole("Strart calculation: ");
        long c = calculator.plus(a, b);
        logger.logToConsole(a + " + " + b + " = " + c);
    }
}
