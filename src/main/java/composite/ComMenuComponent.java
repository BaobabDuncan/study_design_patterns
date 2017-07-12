package composite;

import java.util.Iterator;

/**
 * Created by Administrator on 2017-07-13.
 */
public abstract class ComMenuComponent {
    public void add(ComMenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(ComMenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public ComMenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public String getDescription(){
        throw new UnsupportedOperationException();
    }
    public double getPrice(){
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }
    public void print(){
        throw new UnsupportedOperationException();
    }

    abstract public Iterator createIterator();
}
