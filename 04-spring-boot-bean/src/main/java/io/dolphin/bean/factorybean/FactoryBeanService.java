package io.dolphin.bean.factorybean;

import io.dolphin.bean.xml.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanService {
    @Autowired
    @Qualifier("myCat")
    private Animal animal;

    public String hello() {
        return animal.getName();
    }
}
