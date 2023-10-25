package io.dolphin.mybatisredis.service;

import io.dolphin.mybatisredis.bean.User;

public interface UserQueryService {
    public User queryUserById(Integer id);
}
