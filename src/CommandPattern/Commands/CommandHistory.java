package CommandPattern.util;

import CommandPattern.Commands.Command;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandHistory {
    private final Deque<Command> history = new ArrayDeque<>();

    public void push(Command command) {
        history.push(command);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
