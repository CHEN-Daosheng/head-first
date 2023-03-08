package cn.head.first.abstracts.impl;

import cn.head.first.abstracts.Command;

public class PartyCommand implements Command {

    Command[] commands;

    public PartyCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {

        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {

    }
}
