package com.polovnev.creational.factory;

public class ModernFurnitureFactory implements FurnitureFactory {

    public Chair createChair() {
        return new ModernChair();
    }
}
