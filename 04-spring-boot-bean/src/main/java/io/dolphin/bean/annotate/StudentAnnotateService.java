package io.dolphin.bean.annotate;

import io.dolphin.bean.xml.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentAnnotateService {
    @Autowired
    private Animal animal;

    public String hello() {
        return animal.getName();
    }
}
