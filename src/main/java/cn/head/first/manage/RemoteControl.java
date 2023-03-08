package cn.head.first.manage;

import cn.head.first.abstracts.Command;
import cn.head.first.abstracts.NoCommand;

public class RemoteControl {

    Command[] onCommonds;
    Command[] offCommonds;

    Command undoCommand;

    //构造器中初始化啥也不做的命令
    public RemoteControl() {
        onCommonds = new Command[7];
        offCommonds = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommonds[i] = noCommand;
            offCommonds[i] = noCommand;
        }
        undoCommand=noCommand;//最开始初始化的时候，上一个被执行的命令就是空的
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommonds[slot] = onCommand;
        offCommonds[slot] = offCommand;
    }

    //当执行操作时候，这个操作记录下来，作为下一次执行操作的时候的上一次操作
    public void onButtonWasPushed(int slot){
        onCommonds[slot].execute();
        undoCommand=onCommonds[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommonds[slot].execute();
        undoCommand=offCommonds[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString(){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("\n--------Remote Control--------\n");
        for (int i = 0; i < onCommonds.length; i++) {
            stringBuffer.append("[slot "+i+"] "+onCommonds[i].getClass().getName()+"     "+offCommonds[i].getClass().getName()+"\n");
        }
        return stringBuffer.toString();
    }


}
