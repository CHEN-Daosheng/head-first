package cn.head.first.service;

import cn.head.first.abstracts.ChicagoCheesePizza;
import cn.head.first.abstracts.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoCheesePizza();
        }
        return null;
    }
}
