package cn.head.first.abstracts;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        System.out.println("Give me a PepperoniPizza");
    }

    @Override
    public void prepare() {
        System.out.println("PepperoniPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("PepperoniPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("PepperoniPizza cut");
    }

    @Override
    public void box() {
        System.out.println("PepperoniPizza box");
    }
}
