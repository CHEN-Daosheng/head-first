package cn.head.first.interfaces.impl;

import cn.head.first.entity.MenueItem;
import cn.head.first.interfaces.TIterator;


public class DinerMenuIterator implements TIterator {

    MenueItem[] items;

    int position = 0;

    public DinerMenuIterator(MenueItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenueItem menueItem = items[position];
        position = position + 1;
        return menueItem;
    }
}
