package cn.head.first;

import cn.head.first.abstracts.MenuComponent;
import cn.head.first.service.*;
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
public class MenueDriverTest {

    @Test
    public void testMenuComponent() {

        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Diner");
        MenuComponent caffeeMenu = new Menu("Caffee Menu", "Caffee");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert");

        MenuComponent allMenus = new Menu("All Menu", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(caffeeMenu);
        allMenus.add(dessertMenu);

        dinerMenu.add(new MenuItem("Apple Pie", "Apple Pie with a crust", true, 1.59));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Pasta", "Pasta Pie with a crust", true, 6.36));




        WaitressIT waitressIT = new WaitressIT(allMenus);
        waitressIT.printMenu();
    }

}
