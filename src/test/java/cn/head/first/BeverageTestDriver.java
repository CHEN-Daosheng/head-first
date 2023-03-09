package cn.head.first;

import cn.head.first.entity.CoffeeWithHook;
import cn.head.first.entity.TeaWithHook;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 模板模式
 */
@Slf4j
@SpringBootTest(classes = HeadFirstApplication.class)
@RunWith(SpringRunner.class)
public class BeverageTestDriver {

    @Test
    public void testBeverage(){
        TeaWithHook teaWithHook=new TeaWithHook();
        CoffeeWithHook coffeeWithHook=new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaWithHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
