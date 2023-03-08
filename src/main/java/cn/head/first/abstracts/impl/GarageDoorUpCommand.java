package cn.head.first.abstracts.impl;

import cn.head.first.abstracts.Command;
import cn.head.first.entity.CeilingFan;
import cn.head.first.entity.GarageDoor;

public class GarageDoorUpCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {

    }
}
