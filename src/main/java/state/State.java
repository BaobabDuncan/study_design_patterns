package state;

/**
 * Created by Administrator on 2017-07-13.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
