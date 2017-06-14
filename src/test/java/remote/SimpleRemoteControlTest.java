package remote;

import junit.framework.TestCase;
import remote.*;

/**
 * Created by Administrator on 2017-06-10.
 */
public class SimpleRemoteControlTest extends TestCase {
    public void testInit() {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        remoteControl.setCommand(0, new LightOnCommand(new Light()), new LightOffCommand(new Light()));
        remoteControl.setCommand(1, new StereoOnWithCDCommand(new Stereo()), new StereoOffWithCDCommand(new Stereo()));
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(new LightOnCommand(new Light()));
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(new GarageDoorOpenCommand(new GarageDoor()));
        simpleRemoteControl.buttonWasPressed();

        Light light = new Light();
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        Command[] partyOn = {lightOnCommand, stereoOnWithCDCommand};
        Command[] partyOff = {lightOffCommand, stereoOffWithCDCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(2, partyOnMacro, partyOffMacro);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
    }
}
