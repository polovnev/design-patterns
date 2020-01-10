package com.polovnev.behavioral.command;

public class AddCommand implements Command {

    @Override
    public void execute() {
        System.out.println("add");
    }

    @Override
    public void undo() {
        System.out.println("add canceled");
    }
}
