package cn.head.first.service;

import cn.head.first.abstracts.Beverage;

public class HouseBlend extends Beverage {


    public HouseBlend(){
        description="House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
