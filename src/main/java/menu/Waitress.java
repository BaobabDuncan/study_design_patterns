package menu;

import java.util.Iterator;

/**
 * Created by Administrator on 2017-06-24.
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator pancakeMyIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMyIterator = dinerMenu.createIterator();
        Iterator cafeMenuIterator = cafeMenu.createIterator();
        System.out.println("메뉴\n----\n아침 메뉴");
        printMenu(pancakeMyIterator);
        System.out.println("\n점심 메뉴");
        printMenu(dinerMyIterator);
        System.out.println("\n저녁 메뉴");
        printMenu(cafeMenuIterator);
    }

    private void printMenu(Iterator myIterator) {
        while (myIterator.hasNext()) {
            MenuItem menuItem = (MenuItem) myIterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
