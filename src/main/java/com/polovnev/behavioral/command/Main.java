package com.polovnev.behavioral.command;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Executor executor = new Executor();
        List<Command> commands = Arrays.asList(new SaveCommand(), new SaveCommand(),new SaveCommand(),new AddCommand(), new SaveCommand());
        for (Command command : commands) {
            executor.execute(command);
        }
        System.out.println("------------------------");
        executor.undo();
        executor.undo();
        System.out.println("------------------------");
        System.out.println(executor.getHistory().size() == 3);
    }
}
