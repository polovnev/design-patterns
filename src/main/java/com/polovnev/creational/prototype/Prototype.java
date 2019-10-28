package com.polovnev.creational.prototype;

public class Prototype implements Cloneable {

    private int privateField;

    public Prototype(int privateField) {
        this.privateField = privateField;
    }

    public int getPrivateField() {
        return privateField;
    }

    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
