package cn.head.first.abstracts.impl;

import cn.head.first.abstracts.Command;
import cn.head.first.entity.CeilingFan;
import cn.head.first.entity.Light;

public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {

    }
}
