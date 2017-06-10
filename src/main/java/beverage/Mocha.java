package beverage;

/**
 * Created by Administrator on 2017-06-10.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    Mocha (Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    public String getSize() {
        return beverage.getSize();
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
