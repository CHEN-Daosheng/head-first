package cn.head.first.abstracts.impl;

import cn.head.first.abstracts.Command;
import cn.head.first.entity.Stereo;

public class StersoOnWithCDCommand implements Command {

    Stereo stereo;

    public StersoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {

    }
}
