package io.dolphin.bean.xml;

public class AnimalFactoryInstance {
    public Animal getAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
