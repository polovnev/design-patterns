package com.polovnev.behavioral.command;

public class SaveCommand implements Command {

    @Override
    public void execute() {
        System.out.println("save");
    }

    @Override
    public void undo() {
        System.out.println("save canceled");
    }
}
