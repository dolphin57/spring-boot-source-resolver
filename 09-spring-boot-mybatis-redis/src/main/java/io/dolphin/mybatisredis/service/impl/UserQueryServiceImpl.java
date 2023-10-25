package io.dolphin.mybatisredis.service.impl;

import io.dolphin.mybatisredis.bean.User;
import io.dolphin.mybatisredis.repository.UserRepository;
import io.dolphin.mybatisredis.service.UserQueryService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserQueryServiceImpl implements UserQueryService {
    @Resource(name = "userRepositoryCacheImpl")
    private UserRepository userRepository;

    @Override
    public User queryUserById(Integer id) {
        return userRepository.queryUserById(id);
    }
}
