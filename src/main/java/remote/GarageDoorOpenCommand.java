package remote;

/**
 * Created by Administrator on 2017-06-10.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;
    GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;

    }
    public void execute() {
        garageDoor.up();
    }

    public void undo() {
        garageDoor.down();
    }
}
