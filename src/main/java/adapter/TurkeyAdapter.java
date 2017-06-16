package adapter;

/**
 * Created by Administrator on 2017-06-15.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    public String quack() {
        return turkey.gobble();
    }

    public String fly() {
        return turkey.fly();
    }
}
