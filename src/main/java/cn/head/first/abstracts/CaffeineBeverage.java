package cn.head.first.abstracts;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    void boilWater(){
        System.out.println("CaffeineBeverage Boiling water");
    }

    void pourInCup(){
        System.out.println("CaffeineBeverage Pouring into Cup");
    }



}
