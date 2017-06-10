package pizza;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017-06-10.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;
    ArrayList toppings = new ArrayList();

    abstract void prepare();

//    void prepare(){
//        System.out.println("Preparing " + name);
//        System.out.println("Tossing douht...");
//        System.out.println("Adding sauce...");
//        System.out.println("Adding toppings: ");
//        for (int i = 0; i < toppings.size(); i++){
//            System.out.println("   " + toppings.get(i));
//        }
//    }
    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box(){
        System.out.println("Place pizza in official pizza.PizzaStore box");
    }

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
}
