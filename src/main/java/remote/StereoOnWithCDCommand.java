package remote;

/**
 * Created by Administrator on 2017-06-13.
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    public void undo() {
        stereo.off();
    }
}
