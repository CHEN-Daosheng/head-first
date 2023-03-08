package cn.head.first.abstracts;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        System.out.println("Give me a ClamPizza");
    }

    @Override
    public void prepare() {
        System.out.println("ClamPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("ClamPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("ClamPizza cut");
    }

    @Override
    public void box() {
        System.out.println("ClamPizza box");
    }
}
