package cn.head.first;

import cn.head.first.service.Singletion;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 单例模式
 */
@Slf4j
@SpringBootTest(classes = HeadFirstApplication.class)
@RunWith(SpringRunner.class)
public class SingletionTest {

    @Test
    public void testS(){
        //构造器是私有的，不能直接 new 的方式创建对象
        //
        Singletion singletion=Singletion.getInstance();
        System.out.println("++++++++++++++++++++++++++");
        Singletion singletion2=Singletion.getInstance();
    }

}
