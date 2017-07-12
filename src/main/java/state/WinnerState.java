package state;

/**
 * Created by Administrator on 2017-07-13.
 */
public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("에러");
    }

    public void ejectQuarter() {
        System.out.println("에러");
    }

    public void turnCrank() {
        System.out.println("에러");
    }

    public void dispense() {
        System.out.println("축하드립니다! 알맹이를 하나 더 받으실 수 있습니다.");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
