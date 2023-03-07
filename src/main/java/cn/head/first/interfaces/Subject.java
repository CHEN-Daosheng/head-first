package cn.head.first.interfaces;

public interface Subject {

    public void registerObserver(Observer o);//注册观察者

    public void removeObserver(Observer o);//移除观察者

    public void notifyObservers();//有改变的时候通知所有观察者
}
