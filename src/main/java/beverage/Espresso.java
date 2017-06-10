package beverage;

/**
 * Created by Administrator on 2017-06-10.
 */
public class Espresso extends Beverage {
    public Espresso(String size){
        description = "에스프레소";
        this.size = size;
    }
    public double cost() {
        return 1.99;
    }
}
