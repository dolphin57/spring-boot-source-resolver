package io.dolphin.bean.beanfactory;

import io.dolphin.bean.entity.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanFactoryTest {
    @Autowired
    private Teacher teacher;

    @Test
    public void teacher() {
        System.out.println(teacher.getName());
    }
}
