package cn.head.first;

import cn.head.first.entity.UserDO;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONValue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@SpringBootTest(classes = HeadFirstApplication.class)
@RunWith(SpringRunner.class)
public class StreamTest {

    private static List<UserDO> users = new ArrayList<>();

    static {
        UserDO user1 = new UserDO();
        user1.setName("张三");
        user1.setDesc("张三的备注信息");
        user1.setCardId("TEST_01");
        user1.setScore(88l);
        users.add(user1);
        UserDO user2 = new UserDO();
        user2.setName("李四");
        user2.setDesc("李四的备注信息");
        user2.setCardId("TEST_02");
        user2.setScore(838l);
        users.add(user2);
        UserDO user3 = new UserDO();
        user3.setName("王五");
        user3.setDesc("王五的备注信息");
        user3.setCardId("TEST_03");
        user3.setScore(98l);
        users.add(user3);
        UserDO user4 = new UserDO();
        user4.setDesc("王五的备注信息");
        user4.setCardId("TEST_03");
        users.add(user4);
    }


    @Test
    public void testStreamCount() {
        Long count = users.stream().filter(p -> null != p.getName()).count();
        log.info("list的流操作，计数：{}", count);
        users.stream().filter(p -> null != p.getName()).count();
    }

    @Test
    public void testStreamMap() {
        String names = users.stream().map(p -> p.getName()).collect(Collectors.joining(","));
        log.info("list的流操作，处理：{}", names);
    }

    @Test
    public void testStreamSorted() {
        List<UserDO> usersF = users.stream().filter(p -> null != p.getScore()).sorted(Comparator.comparing(UserDO::getScore).reversed()).collect(Collectors.toList());
        log.info("list的流操作，排序：{}", JSONValue.toJSONString(usersF));
    }
}
