package cn.head.first.abstracts;

import cn.head.first.interfaces.impl.FlyWithWings;
import cn.head.first.interfaces.impl.Quack;

import java.security.PublicKey;

/**
 *  绿头鸭
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior=new Quack();//呱呱叫交给quack
        flyBehavior=new FlyWithWings();//飞的事情交给带翅膀的
    }


    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck");
    }
}
