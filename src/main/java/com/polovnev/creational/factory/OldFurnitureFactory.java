package com.polovnev.creational.factory;

public class OldFurnitureFactory implements FurnitureFactory {

    public Chair createChair() {
        return new OldChair();
    }
}
