package cn.head.first.interfaces.impl;

import cn.head.first.interfaces.DisplayElement;
import cn.head.first.interfaces.Observer;
import cn.head.first.interfaces.Subject;

/**
 * 布告板
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    public float temperature;

    private float humidity;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+"F degress and "+humidity+"% humidity");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temp;
        this.humidity=humidity;
        display();
    }
}
