package simuduck;

/**
 * Created by sanguk on 09/06/2017.
 */
public class RubberDuck extends Duck {
    public RubberDuck (){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    String display() {
        return "고무 오리 모양";
    }
}
