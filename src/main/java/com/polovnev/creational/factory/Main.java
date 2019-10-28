package com.polovnev.creational.factory;

public class Main {

    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();
        furnitureFactory.createChair().printMessage();
        furnitureFactory = new OldFurnitureFactory();
        furnitureFactory.createChair().printMessage();
    }
}
