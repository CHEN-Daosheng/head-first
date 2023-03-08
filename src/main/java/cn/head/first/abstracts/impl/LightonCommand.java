package cn.head.first.abstracts.impl;

import cn.head.first.abstracts.Command;
import cn.head.first.entity.Light;

public class LightonCommand implements Command {

    Light light;

    /**
     * 构造器接受传来的对象，比如电灯，等需要操作的对象
     * @param light
     */
    public LightonCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {

    }
}
