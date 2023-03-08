package cn.head.first.interfaces.impl;

import cn.head.first.interfaces.Duck;

public class MallardDuck implements Duck {


    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am Flying");
    }
}
