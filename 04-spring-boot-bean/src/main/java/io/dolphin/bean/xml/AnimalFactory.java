package io.dolphin.bean.xml;

import io.dolphin.bean.entity.Animal;
import io.dolphin.bean.entity.Cat;
import io.dolphin.bean.entity.Dog;

public class AnimalFactory {
    public static Animal getAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
