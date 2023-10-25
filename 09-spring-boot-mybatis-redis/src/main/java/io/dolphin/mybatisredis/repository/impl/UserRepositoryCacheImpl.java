package io.dolphin.mybatisredis.repository.impl;

import com.alibaba.fastjson.JSON;
import io.dolphin.mybatisredis.bean.User;
import io.dolphin.mybatisredis.redis.RedisUtil;
import io.dolphin.mybatisredis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Random;

@Component
public class UserRepositoryCacheImpl implements UserRepository {
    private static final String CACHE_PREFIX = "cache_prefix_";

    private User nullUser = new User(-1);

    private static final Random random = new Random();

    @Autowired
    private RedisUtil redisUtil;

    @Resource(name = "userRepositoryDataImpl")
    private UserRepository userRepository;

    @Override
    public User queryUserById(Integer id) {
        User user = getUserFromCache(id);
        if (user == null) {
            System.out.println("cache not hit");
            user = userRepository.queryUserById(id);
            cacheUser(user, id);
        } else if (-1 == user.getId()) {
            System.out.println("cache hit null");
            return null;
        } else {
            System.out.println("cache hit id");
        }
        return user;
    }

    private void cacheUser(User user, Integer id) {
        if (user != null) {
            redisUtil.set(generateCacheKey(id), JSON.toJSONString(user), 10 + random.nextInt(5));
        } else {
            redisUtil.set(generateCacheKey(id), JSON.toJSONString(nullUser), 10 + random.nextInt(5));
        }
    }

    private User getUserFromCache(Integer id) {
        String user = (String) redisUtil.get((generateCacheKey(id)));
        if (!StringUtils.isEmpty(user)) {
            return JSON.parseObject(user, User.class);
        }
        return null;
    }

    private String generateCacheKey(Integer id) {
        return CACHE_PREFIX + id;
    }
}
