package cn.head.first.entity;

public class CeilingFan {

    String ceilingFan;

    public CeilingFan(String ceilingFan){
        this.ceilingFan=ceilingFan;
    }

    public void on() {
        System.out.println(ceilingFan+" "+"CeilingFan on...");
    }

    public void off() {
        System.out.println(ceilingFan+" "+"CeilingFan off...");
    }
}
