package io.dolphin.bean.importbean;

import io.dolphin.bean.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanImportService {
    @Autowired
    @Qualifier("bird")
    private Animal animal;

    public String hello() {
        return animal.getName();
    }
}
