package menu;

/**
 * Created by Administrator on 2017-06-18.
 */
public class MenuItem {
    private String name;
    private String description;
    private boolean vegetarian;
    private Object price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public Object getPrice() {
        return price;
    }
}
