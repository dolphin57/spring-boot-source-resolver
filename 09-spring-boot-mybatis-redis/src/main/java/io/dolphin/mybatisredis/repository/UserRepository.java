package io.dolphin.mybatisredis.repository;

import io.dolphin.mybatisredis.bean.User;

public interface UserRepository {
    User queryUserById(Integer id);
}
