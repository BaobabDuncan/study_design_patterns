package remote;

/**
 * Created by Administrator on 2017-06-13.
 */
public class LightOffCommand implements Command {
    Light light;

    LightOffCommand(Light light){
        this.light = light;
    }
    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
