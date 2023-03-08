package cn.head.first.abstracts;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        System.out.println("Give me a CheesePizza");
    }

    @Override
    public void prepare() {
        System.out.println("CheesePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza box");
    }
}
