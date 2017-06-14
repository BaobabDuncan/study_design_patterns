package remote;

/**
 * Created by Administrator on 2017-06-13.
 */
public class StereoOffWithCDCommand implements Command {
    Stereo stereo;

    StereoOffWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
    }
}
