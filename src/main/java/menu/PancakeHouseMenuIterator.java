package menu;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017-06-26.
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList items;
    int position = 0;
    PancakeHouseMenuIterator(ArrayList items){
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null){
            return false;
        }
        return true;
    }

    public Object next() {
        MenuItem menuItem = (MenuItem) items.get(position);
        position =position + 1;
        return menuItem;
    }
}
