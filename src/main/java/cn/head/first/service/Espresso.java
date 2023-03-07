package cn.head.first.service;

import cn.head.first.abstracts.Beverage;

public class Espresso extends Beverage {


    public Espresso(){
        description="Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
