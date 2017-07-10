package menu;

import java.util.Iterator;

/**
 * Created by Administrator on 2017-06-24.
 */
public class  DinnerMenuMyIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinnerMenuMyIterator(MenuItem[] items){
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

    public void remove() {
        if (position <= 0){
            throw new IllegalStateException("next()를 한 번도 호출하지 않은 상태에서는 삭제할 수 없습니다.");
        }
        if (items[position-1] != null){
            for (int i = position-1; i < (items.length - 1); i++){
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
    }


}
