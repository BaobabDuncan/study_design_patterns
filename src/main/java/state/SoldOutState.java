package state;

/**
 * Created by Administrator on 2017-07-13.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("매진");
    }

    public void ejectQuarter() {
        System.out.println("매진");
    }

    public void turnCrank() {
        System.out.println("매진");
    }

    public void dispense() {
        System.out.println("매진");
    }
}
