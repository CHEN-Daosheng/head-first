package cn.head.first.service;

public class Singletion {

    private static Singletion uniqueInstance;

    //构造器私有
    private Singletion() {
        System.out.println("创建单例模式对象");
    }

    public static Singletion getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singletion();
        }
        System.out.println("已经有一个对象了");
        return uniqueInstance;
    }


}
