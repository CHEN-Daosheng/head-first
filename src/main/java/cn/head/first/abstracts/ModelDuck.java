package cn.head.first.abstracts;

import cn.head.first.interfaces.impl.FlyNoWays;
import cn.head.first.interfaces.impl.FlyWithWings;
import cn.head.first.interfaces.impl.Quack;

public class ModelDuck extends Duck{


    public ModelDuck(){
        flyBehavior=new FlyNoWays();
        quackBehavior=new Quack();
    }


    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
