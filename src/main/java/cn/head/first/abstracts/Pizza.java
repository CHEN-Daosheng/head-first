package cn.head.first.abstracts;

import lombok.Data;

import java.util.ArrayList;

public class Pizza {

    public String name;

    public String dough;

    public String sauce;

    ArrayList toppings = new ArrayList();


    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... ");
        System.out.println("Adding sauce... ");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("     " + toppings.get(i));
        }
    }

    public void bake() {

        System.out.println("bake for 25 minuties at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Boxing the pizza");
    }

    public String getName() {
        return name;
    }
}
