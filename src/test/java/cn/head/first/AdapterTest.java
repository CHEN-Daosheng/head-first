package cn.head.first;

import cn.head.first.adapter.TurkeyAdapter;
import cn.head.first.interfaces.Duck;
import cn.head.first.interfaces.impl.MallardDuck;
import cn.head.first.interfaces.impl.WildTurkey;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 适配器模式
 */

@Slf4j
@SpringBootTest(classes = HeadFirstApplication.class)
@RunWith(SpringRunner.class)
public class AdapterTest {

    //对象适配器
    @Test
    public void testDuck(){
        MallardDuck mallardDuck=new MallardDuck();
        WildTurkey turkey=new WildTurkey();

        Duck turkeyAdapter=new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(mallardDuck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }






}
