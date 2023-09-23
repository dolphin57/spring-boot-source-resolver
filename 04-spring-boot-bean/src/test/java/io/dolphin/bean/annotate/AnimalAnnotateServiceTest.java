package io.dolphin.bean.annotate;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class AnimalAnnotateServiceTest {
    @Autowired
    private AnimalAnnotateService studentService;

    @Test
    void hello() {
        System.out.println(studentService.hello());
    }
}