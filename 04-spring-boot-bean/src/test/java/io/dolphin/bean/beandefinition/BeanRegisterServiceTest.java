package io.dolphin.bean.beandefinition;

import io.dolphin.bean.factorybean.FactoryBeanService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class BeanRegisterServiceTest {
    @Autowired
    private BeanRegisterService beanRegisterService;

    @Test
    void hello() {
        System.out.println(beanRegisterService.hello());
    }
}