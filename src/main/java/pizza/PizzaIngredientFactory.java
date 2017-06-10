package pizza;

/**
 * Created by Administrator on 2017-06-10.
 */
public interface PizzaIngredientFactory {
    public Dough createDougth();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
