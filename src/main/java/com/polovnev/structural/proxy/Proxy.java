package com.polovnev.structural.proxy;

public class Proxy implements Service {

    private Service service = new ServiceImpl();

    public void run() {
        System.out.println("before service run");
        service.run();
        System.out.println("after service run");
    }
}
