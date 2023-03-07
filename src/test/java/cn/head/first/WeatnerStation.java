package cn.head.first;

import cn.head.first.interfaces.WeatherData;
import cn.head.first.interfaces.impl.CurrentConditionsDisplay;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 观察者模式
 */
@Slf4j
@SpringBootTest(classes = HeadFirstApplication.class)
@RunWith(SpringRunner.class)
public class WeatnerStation {

    /**
     * 观察者和可观察者都是个接口，可观察者对象是一个类
     */

    @Test
    public void testWeatherStation(){
        WeatherData weatherData=new WeatherData();
        //CurrentConditionsDisplay conditionsDisplay=new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(90,35,34.4f);
        weatherData.setMeasurements(30,67,64.7f);
        weatherData.setMeasurements(50,89,25.8f);
    }
}
