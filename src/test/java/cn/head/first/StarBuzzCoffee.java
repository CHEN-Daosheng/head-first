package cn.head.first;

import cn.head.first.abstracts.Beverage;
import cn.head.first.service.Espresso;
import cn.head.first.service.HouseBlend;
import cn.head.first.service.Mocha;
import cn.head.first.service.Soy;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 装饰者模式
 */
@Slf4j
@SpringBootTest(classes = HeadFirstApplication.class)
@RunWith(SpringRunner.class)
public class StarBuzzCoffee {


    @Test
    public void testBuzz() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);

        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());


    }
}
