package cn.head.first.service;

import cn.head.first.abstracts.NYCheesePizza;
import cn.head.first.abstracts.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYCheesePizza();
        }
        return null;
    }
}
