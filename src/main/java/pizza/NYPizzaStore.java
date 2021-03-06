package pizza;

/**
 * Created by Administrator on 2017-06-10.
 */
public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style pizza.Cheese pizza.Pizza");
        } else if (item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie pizza.Pizza");
        } else if (item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam pizza.Pizza");
        }else if (item.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style pizza.Pepperoni pizza.Pizza");
        }
        return pizza;
    }
}
