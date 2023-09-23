package io.dolphin.bean.importbean;

import io.dolphin.bean.beandefinition.BeanRegisterService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(MyBeanImport.class)
class BeanImportServiceTest {
    @Autowired
    private BeanImportService beanImportService;

    @Test
    void hello() {
        System.out.println(beanImportService.hello());
    }
}