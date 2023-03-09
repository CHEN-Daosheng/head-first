package cn.head.first.entity;

import cn.head.first.abstracts.CaffeineBeverage;

public class Tea extends CaffeineBeverage {


    @Override
    public void brew() {
        System.out.println("Steeping the Tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon Tea");
    }
}
