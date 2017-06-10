package beverage;

/**
 * Created by Administrator on 2017-06-10.
 */
public abstract class Beverage {

    static String TALL = "tall";
    static String GRANDE = "tall";
    static String VENTI = "tall";

    String description = "제목 없음";
    String size;

    public String getDescription(){
        return description;
    }

    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size = size;

    }

    public abstract double cost();
}
