package cn.head.first.service;

import cn.head.first.abstracts.Beverage;
import cn.head.first.abstracts.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }
}
