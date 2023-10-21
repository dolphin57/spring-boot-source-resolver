package io.dolphin.mybatisredis;

import io.dolphin.mybatisredis.bean.User;
import io.dolphin.mybatisredis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMybatisRedisApplication.class)
class SpringBootMybatisRedisApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {}

    @Test
    public void testInsert() {
        User user = new User();
        user.setId(2);
        user.setName("dolphin");
        user.setPassword("123456");
        user.setAge(18);
        user.setDeleteFlag(0);
        user.setVersion(3);

        userMapper.insert(user);
    }
}
