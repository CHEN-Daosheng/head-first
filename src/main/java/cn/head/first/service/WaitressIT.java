package cn.head.first.service;

import cn.head.first.abstracts.MenuComponent;
import cn.head.first.entity.MenueItem;
import cn.head.first.interfaces.TIterator;

public class WaitressIT {

    MenuComponent menuComponent;

    public WaitressIT(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printMenu() {
        menuComponent.print();
    }
}
