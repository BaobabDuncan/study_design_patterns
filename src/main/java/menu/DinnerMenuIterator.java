package menu;

/**
 * Created by Administrator on 2017-06-24.
 */
public class DinnerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null){
            return false;
        }
        return true;
    }


    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}
