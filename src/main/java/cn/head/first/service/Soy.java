package cn.head.first.service;

import cn.head.first.abstracts.Beverage;
import cn.head.first.abstracts.CondimentDecorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+18.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Soy";
    }
}
