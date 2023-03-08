package cn.head.first.abstracts.impl;

import cn.head.first.abstracts.Command;
import cn.head.first.entity.Stereo;

public class StersoOffCommand implements Command {

    Stereo stereo;

    public StersoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();

    }

    @Override
    public void undo() {

    }
}
