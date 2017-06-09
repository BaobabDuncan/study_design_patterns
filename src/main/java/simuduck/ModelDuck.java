package simuduck;

/**
 * Created by sanguk on 09/06/2017.
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    String display() {
        return "모델 오리 모양";
    }
}
