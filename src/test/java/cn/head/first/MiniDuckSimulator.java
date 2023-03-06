package cn.head.first;

import cn.head.first.abstracts.Duck;
import cn.head.first.abstracts.MallardDuck;
import cn.head.first.abstracts.ModelDuck;
import cn.head.first.interfaces.impl.FlyRocketPowerd;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@SpringBootTest(classes = HeadFirstApplication.class)
@RunWith(SpringRunner.class)
public class MiniDuckSimulator {

    /**
     * 策略模式
     */
    @Test
    public void testDuck(){
        Duck mallard=new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelDuck=new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowerd());
        modelDuck.performFly();
    }
}
