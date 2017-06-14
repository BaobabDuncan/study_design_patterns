package remote;

/**
 * Created by Administrator on 2017-06-10.
 */
public class SimpleRemoteControl {
    Command slot;

    SimpleRemoteControl(){}

    void setCommand(Command command){
        slot = command;
    }

    void buttonWasPressed(){
        slot.execute();
    }
}
