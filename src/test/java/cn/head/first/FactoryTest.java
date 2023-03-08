package cn.head.first;

import cn.head.first.abstracts.Pizza;
import cn.head.first.service.ChicagoPizzaStore;
import cn.head.first.service.NYPizzaStore;
import cn.head.first.service.PizzaStore;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@SpringBootTest(classes = HeadFirstApplication.class)
@RunWith(SpringRunner.class)
public class FactoryTest {

    @Test
    public void testFactory(){
        //Pizza p=new

        PizzaStore nyStore=new NYPizzaStore();
        PizzaStore chicagoStore=new ChicagoPizzaStore();

        Pizza pizza=nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");

        pizza=chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a "+pizza.getName()+"\n");
    }
}
