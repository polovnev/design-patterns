package com.polovnev.behavioral.command;

import java.util.LinkedList;
import java.util.Queue;

public class Executor {

    private LinkedList<Command> history;

    public Queue<Command> getHistory() {
        return history;
    }

    public Executor() {
        this.history = new LinkedList<>();
    }

    public void execute(Command command) {
        command.execute();
        history.add(command);
    }

    public void undo() {
        Command command = history.removeLast();
        if (command != null) {
            command.undo();
        }
    }
}
