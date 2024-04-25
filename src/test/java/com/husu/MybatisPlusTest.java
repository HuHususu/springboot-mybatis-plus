package com.husu;

import com.husu.mapper.UserMapper;
import com.husu.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author huyong(husu)
 * @date 4/25/2024 5:13 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void test_insert() {
        User user = new User();
        user.setName("胡勇");
        user.setAge(20);
        user.setEmail("ricardoyhu@163.com");
        userMapper.insert(user);
    }
}
