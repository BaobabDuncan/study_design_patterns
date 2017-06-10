package beverage;

/**
 * Created by Administrator on 2017-06-10.
 */
public class HouseBlend extends Beverage {
    HouseBlend(String size){
        description = "하우스 블렌드 커피";
        this.size = size;
    }
    public double cost() {
        return .89;
    }
}
