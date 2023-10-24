package io.dolphin.mybatisredis;

import com.sun.deploy.util.StringUtils;
import io.dolphin.mybatisredis.bean.User;
import io.dolphin.mybatisredis.bean.UserExample;
import io.dolphin.mybatisredis.mapper.UserMapper;
import io.dolphin.mybatisredis.redis.RedisUtil;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMybatisRedisApplication.class)
class SpringBootMybatisRedisApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisUtil redisUtil;

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

    // 全量更新
    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(2);
        user.setName("eric");

        userMapper.updateByPrimaryKey(user);
    }

    @Test
    public void testUpdatePrimaryKeySelective() {
        User user = new User();
        user.setId(2);
        user.setName("eric");

        userMapper.updateByPrimaryKeySelective(user);
    }

    @Test
    public void testUpdateExampleSelective() {
        User user = new User();
        user.setAge(20);
        UserExample userExample = new UserExample();
        userExample.createCriteria().andAgeEqualTo(18);

        userMapper.updateByExampleSelective(user, userExample);
    }

    @Test
    public void testQuery() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andAgeEqualTo(18);

        List<User> userList = userMapper.selectByExample(userExample);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testDelete() {
        userMapper.deleteByPrimaryKey(2);
    }

    @Test
    public void testRedis() throws InterruptedException {
        redisUtil.set("dolphin", "test", 3);
        System.out.println(redisUtil.get("dolphin"));
        Thread.sleep(3000);
        System.out.println(redisUtil.get("dolphin"));
    }
}
