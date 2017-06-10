package beverage;

/**
 * Created by Administrator on 2017-06-10.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    Whip(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑 크림";
    }

    public String getSize() {
        return beverage.getSize();
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
