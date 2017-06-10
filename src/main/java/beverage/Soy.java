package beverage;

/**
 * Created by Administrator on 2017-06-10.
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 듀유";
    }

    public String getSize() {
        return beverage.getSize();
    }

    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Beverage.TALL) {
            cost += .10;
        } else if (getSize() == Beverage.GRANDE) {
            cost += .15;
        } else if (getSize() == Beverage.VENTI) {
            cost += .20;
        }
        return cost;
    }
}
