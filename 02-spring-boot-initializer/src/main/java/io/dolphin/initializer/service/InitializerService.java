package io.dolphin.initializer.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description:
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

    public String initializer() {
        return applicationContext.getEnvironment().getProperty("key3");
    }
}
