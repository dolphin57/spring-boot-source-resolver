package io.dolphin.initializer.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description: 初始化器:注入自定义属性
 * @Author: Eric Liang
 * @Since: 2020-7-11 10:46
 */
@Component
public class InitializerService implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public String initializer(String key) {
        return applicationContext.getEnvironment().getProperty(key);
    }
}
