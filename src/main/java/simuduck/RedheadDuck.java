package simuduck;

/**
 * Created by sanguk on 09/06/2017.
 */
public class RedheadDuck extends Duck {
    public RedheadDuck(){
        quackBehavior = new Squack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    String display() {
        return "붉은머리 오리 모양";
    }
}
