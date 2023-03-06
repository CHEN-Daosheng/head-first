package cn.head.first.interfaces.impl;

import cn.head.first.interfaces.FlyBehavior;

public class FlyNoWays implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly No Way !!");
    }
}
