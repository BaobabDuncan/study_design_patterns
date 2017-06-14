package remote;

/**
 * Created by Administrator on 2017-06-10.
 */
public interface Command {
    void execute();

    void undo();
}
