package cn.head.first;

import cn.head.first.interfaces.impl.DinerMenuIterator;
import cn.head.first.service.DinnerMenu;
import cn.head.first.service.Waitress;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 迭代器模式
 */
@Slf4j
@SpringBootTest(classes = HeadFirstApplication.class)
@RunWith(SpringRunner.class)
public class MenueTest {

    @Test
    public void testIterator() {
        DinnerMenu dinnerMenu=new DinnerMenu();
        Waitress waitress=new Waitress(dinnerMenu);
        waitress.printMenu();
    }

}
