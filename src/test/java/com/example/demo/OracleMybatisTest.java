package com.example.demo;

import com.example.demo.dao.UserMapper;
import com.example.demo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * FileName :
 *
 * @author : LiXiaoKang
 * @date : 2020/3/12 23:45
 * Description :
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class OracleMybatisTest {
    @Resource
    UserMapper userMapper;
    @Test
    public void test1() {
        User user = new User();
        user.setId(new Integer(4));
        user.setPassword("123");
        user.setUsername("xiaoming");
        int result = userMapper.insert(user);
        System.out.println(result);
    }

}
