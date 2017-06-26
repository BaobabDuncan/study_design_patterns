package menu;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017-06-18.
 */
public class MenuItemTest extends TestCase {
    public void testInit(){
        String name = "test";
        String description = "test";
        boolean vegetarian = true;
        double price = 2.4;

        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        assertEquals(name, menuItem.getName());
        assertEquals(description, menuItem.getDescription());
        assertEquals(vegetarian, menuItem.isVegetarian());
        assertEquals(price, menuItem.getPrice());
    }

    public void testPancakeHouse(){

        PancakeHouseMenu pancakeHouse = new PancakeHouseMenu();

    }

    public void testDinerMenu(){
        DinerMenu dinerMenu = new DinerMenu();
    }

    public void testWaitress(){
        Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());
        waitress.printMenu();
    }
}
