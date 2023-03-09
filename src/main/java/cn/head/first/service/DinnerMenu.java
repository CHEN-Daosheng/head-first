package cn.head.first.service;

import cn.head.first.entity.MenueItem;
import cn.head.first.interfaces.TIterator;
import cn.head.first.interfaces.impl.DinerMenuIterator;

public class DinnerMenu {

    static final int MAX_ITEMS = 6;

    int numberOfItems = 0;

    MenueItem[] menueItems=new MenueItem[3];


    public DinnerMenu() {
        addItem("煎饼果子", "山东风味的", true, 6);
        addItem("肉夹馍", "陕西风味的", false, 10);
        addItem("正宗河北安徽牛肉板面", "华北地区的群众都爱吃", false, 8);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenueItem menueItem = new MenueItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("SORRY,menu is full! Can't add item to menu");
        } else {
            menueItems[numberOfItems] = menueItem;
            numberOfItems = numberOfItems + 1;
        }
    }


    public TIterator createIterator() {
        return new DinerMenuIterator(menueItems);
    }
}
