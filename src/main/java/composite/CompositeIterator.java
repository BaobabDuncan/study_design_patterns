package composite;

import menu.Menu;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by Administrator on 2017-07-13.
 */
public class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    public Object next() {
        if (hasNext()){
            Iterator iterator = (Iterator)stack.peek();
            ComMenuComponent component = (ComMenuComponent)iterator.next();
            if (component instanceof Menu){
                stack.push(component.createIterator());
            }
            return component;
        }else{
            return null;
        }

    }

    public boolean hasNext() {
        if (stack.isEmpty()){
            return false;
        }else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()){
                stack.pop();
                return hasNext();
            } else{
                return false;
            }
        }
    }



    public void remove() {
        throw new UnsupportedOperationException();
    }
}
