package simuduck;

/**
 * Created by sanguk on 09/06/2017.
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    String display() {
        return "물오리 모양";
    }
}
