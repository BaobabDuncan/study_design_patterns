package facade;

/**
 * Created by Administrator on 2017-06-17.
 */
public class Amplifier {
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cdPlayer;
    private int volume;

    public void on() {
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
    }

    public void setSurroundSound() {
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void off() {
    }
}
