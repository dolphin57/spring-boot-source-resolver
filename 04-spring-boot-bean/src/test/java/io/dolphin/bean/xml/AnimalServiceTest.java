package io.dolphin.bean.xml;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(locations = "classpath:ioc/ioc.xml")
class AnimalServiceTest {
    @Autowired
    private AnimalService animalService;

    @Test
    void getAnimal() {
        System.out.println(animalService.getAnimal().getName());
    }
}