package cn.head.first.interfaces.impl;

import cn.head.first.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying ! !");
    }
}
