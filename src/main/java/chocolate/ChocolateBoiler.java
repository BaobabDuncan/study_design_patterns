package chocolate;

/**
 * Created by Administrator on 2017-06-10.
 */
public class ChocolateBoiler {
    private boolean boiled;
    private boolean empty;
    private volatile static ChocolateBoiler instance;

    private ChocolateBoiler(){
        boiled = false;
        empty = true;
    }

    public static ChocolateBoiler getInstance() {
        if (null == instance){
            synchronized (ChocolateBoiler.class){
                instance = new ChocolateBoiler();
            }

        }
        return instance;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void fill() {
        if (isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()){
            empty = true;
        }
    }
}
