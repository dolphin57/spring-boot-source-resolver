package io.dolphin.mybatisredis.repository.impl;

import io.dolphin.mybatisredis.bean.User;
import io.dolphin.mybatisredis.mapper.UserMapper;
import io.dolphin.mybatisredis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryDataImpl implements UserRepository {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
