package cn.head.first.service;

import cn.head.first.entity.MenueItem;
import cn.head.first.interfaces.TIterator;

public class Waitress {

    DinnerMenu dinnerMenu;

    public Waitress(DinnerMenu dinnerMenu) {
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        TIterator dinerIterator = dinnerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(dinerIterator);
    }

    private void printMenu(TIterator iterator) {
        while (iterator.hasNext()) {
            MenueItem menueItem = (MenueItem) iterator.next();
            System.out.print(menueItem.getName()+", ");
            System.out.print(menueItem.getVegetarian()+", ");
            System.out.print(menueItem.getDescription()+", ");
            System.out.println(menueItem.getPrice()+"元");
        }
    }
}
