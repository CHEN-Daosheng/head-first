package cn.head.first.abstracts;

public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        System.out.println("Give me a VeggiePizza");
    }

    @Override
    public void prepare() {
        System.out.println("VeggiePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("VeggiePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("VeggiePizza cut");
    }

    @Override
    public void box() {
        System.out.println("VeggiePizza box");
    }
}
