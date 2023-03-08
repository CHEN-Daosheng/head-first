package cn.head.first.entity;

import lombok.Data;

@Data
public class Light {

    String light;

    public Light(String light){
        this.light=light;
    }

    public void on() {
        System.out.println(light+" "+"Light on...");
    }

    public void off() {
        System.out.println(light+" "+"Light off...");
    }
}
