package cn.head.first.abstracts;

public abstract class CaffeineBeverageWithHook {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }

    }

    public abstract void brew();

    public abstract void addCondiments();

    void boilWater() {
        System.out.println("CaffeineBeverage Boiling water");
    }

    void pourInCup() {
        System.out.println("CaffeineBeverage Pouring into Cup");
    }

   public boolean customerWantsCondiments() {
        return true;
    }


}
