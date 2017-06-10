package pizza;

/**
 * Created by Administrator on 2017-06-10.
 */
public abstract class PizzaStore {
//    pizza.SimplePizzaFactory factory;
//    pizza.PizzaStore(pizza.SimplePizzaFactory factory){
//        this.factory = factory;
//    }
    Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    abstract Pizza createPizza(String type);
}
