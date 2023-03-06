package cn.head.first.interfaces.impl;

import cn.head.first.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak...");
    }
}
