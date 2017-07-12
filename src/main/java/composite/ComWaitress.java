package composite;

import java.util.Iterator;

/**
 * Created by Administrator on 2017-07-13.
 */
public class ComWaitress {
    ComMenuComponent allMenus;

    public ComWaitress(ComMenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETATIAN MENU\n-----");
        while (iterator.hasNext()){
            ComMenuComponent menuComponent = (ComMenuComponent)iterator.next();
            try{
                if (menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e){

            }
        }
    }
}
