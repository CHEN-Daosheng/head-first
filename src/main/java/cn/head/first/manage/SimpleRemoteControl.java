package cn.head.first.manage;

import cn.head.first.abstracts.Command;

public class SimpleRemoteControl {

    Command slot;

    //遥控器的设置命令方法，这个药现设设置命令，在按下按钮才有意义
    public void setCommand(Command command) {
        slot = command;
    }

    //遥控器的 按下按钮方法
    public void butttonWasPressed() {
        slot.execute();
    }
}
