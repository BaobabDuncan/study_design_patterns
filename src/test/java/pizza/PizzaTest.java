package pizza;

import junit.framework.TestCase;
import pizza.NYPizzaStore;
import pizza.PizzaStore;

/**
 * Created by Administrator on 2017-06-10.
 */
public class PizzaTest extends TestCase{
    public void testInit(){
//        pizza.SimplePizzaFactory factory = new pizza.SimplePizzaFactory();
//        pizza.PizzaStore pizzaStore = new pizza.PizzaStore(factory);
//
//        pizzaStore.orderPizza("cheese");

        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");

//        pizza.PizzaStore pizzaStore1 = new pizza.ChicagoPizzaStore();
//        pizzaStore1.orderPizza("cheese");


    }

}
