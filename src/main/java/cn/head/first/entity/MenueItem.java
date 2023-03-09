package cn.head.first.entity;

public class MenueItem {


    String name;

    String description;

    boolean vegetarian;

    double price;

    //有参构造器
    public MenueItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean getVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }


}
