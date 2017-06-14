package remote;

/**
 * Created by Administrator on 2017-06-13.
 */
public class Stereo {

    public void on() {
        System.out.println("remote.Stereo is on");
    }

    public void off() {
        System.out.println("remote.Stereo is off");
    }

    public void setCD() {
        System.out.println("remote.Stereo is set CD");
    }

    public void setVolume(int volume) {
        System.out.println("remote.Stereo is set volume to" + volume);
//        this.volume = volume;
    }
}
