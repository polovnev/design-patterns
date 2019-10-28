package com.polovnev.creational.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
       Prototype prototype = new Prototype(1);
       Prototype clonedPrototype = prototype.clone();
       if(prototype != clonedPrototype && prototype.getPrivateField() == clonedPrototype.getPrivateField()) {
           System.out.println("OK!");
       }
    }
}
