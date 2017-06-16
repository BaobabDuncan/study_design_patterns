package adapter;

/**
 * Created by Administrator on 2017-06-15.
 */
public class DuckAdapter implements Turkey {
    Duck duck;
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    public String gobble() {
        return duck.quack();
    }

    public String fly() {
        return duck.fly();
    }
}
