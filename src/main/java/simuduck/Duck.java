package simuduck;

/**
 * Created by sanguk on 09/06/2017.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    String swim() {
        return "swim";
    }

    String display() {
        return "display";
    }

    void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    String performQuack() {
        return quackBehavior.quack();
    }

    String performFly() {
        return flyBehavior.fly();
    }
}
