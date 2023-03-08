package cn.head.first;

import cn.head.first.abstracts.Command;
import cn.head.first.abstracts.impl.*;
import cn.head.first.entity.CeilingFan;
import cn.head.first.entity.GarageDoor;
import cn.head.first.entity.Light;
import cn.head.first.entity.Stereo;
import cn.head.first.manage.RemoteControl;
import cn.head.first.manage.SimpleRemoteControl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 命令模式
 */

@Slf4j
@SpringBootTest(classes = HeadFirstApplication.class)
@RunWith(SpringRunner.class)
public class RemoteControlTest {


    @Test
    public void testRemoteControle() {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light("Living Room");
        LightonCommand lightonCommand = new LightonCommand(light);
        simpleRemoteControl.setCommand(lightonCommand);
        simpleRemoteControl.butttonWasPressed();
    }


    @Test
    public void testRemoteLoder() {

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kittchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("under floor");
        Stereo stereo = new Stereo("Living Room");

        LightonCommand livingRoomLightOn = new LightonCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightonCommand kittchenLightOn = new LightonCommand(kittchenLight);
        LightOffCommand kittchenLightOff = new LightOffCommand(kittchenLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StersoOnWithCDCommand stersoOnWithCDCommand = new StersoOnWithCDCommand(stereo);
        StersoOffCommand stersoOffCommand = new StersoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kittchenLightOn, kittchenLightOff);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, stersoOnWithCDCommand, stersoOffCommand);
        //remoteControl.setCommand(4, garageDoorUpCommand, garageDoorDownCommand);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }


    @Test
    public void withUndo(){
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        LightonCommand livingRoomLightOn = new LightonCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }

    @Test
    public void testParty(){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kittchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("under floor");
        Stereo stereo = new Stereo("Living Room");

        LightonCommand livingRoomLightOn = new LightonCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightonCommand kittchenLightOn = new LightonCommand(kittchenLight);
        LightOffCommand kittchenLightOff = new LightOffCommand(kittchenLight);
        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        Command[] partyOn={livingRoomLightOn,kittchenLightOn,ceilingFanOnCommand};
        Command[] partyOff={livingRoomLightOff,kittchenLightOff,ceilingFanOffCommand};

        PartyCommand partyCommandOn=new PartyCommand(partyOn);
        PartyCommand partyCommandOff=new PartyCommand(partyOff);
        remoteControl.setCommand(0,partyCommandOn,partyCommandOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
    }

}
