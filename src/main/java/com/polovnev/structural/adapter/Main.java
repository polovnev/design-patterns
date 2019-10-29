package com.polovnev.structural.adapter;

public class Main {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(7.0);
        RoundPeg roundPeg = new RoundPeg(8.0);
        SquarePeg squarePeg = new SquarePeg(5.5);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        if(!roundHole.isFit(roundPeg) && roundHole.isFit(squarePegAdapter)) {
            System.out.println("OK!");
        }
    }
}
