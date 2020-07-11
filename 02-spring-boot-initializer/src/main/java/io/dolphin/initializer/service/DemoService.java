package io.dolphin.initializer.service;

import io.dolphin.initializer.bean.Demo;
import io.dolphin.initializer.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Description:
 * @Author: Eric Liang
 * @Since: 2020-6-27 16:06
 */
@Component
public class DemoService {
    @Autowired
    private DemoMapper demoMapper;

    public Demo getDemoById(Long id) {
        return Optional.ofNullable(demoMapper.selectByPrimaryKey(id)).orElse(null);
    }
}
