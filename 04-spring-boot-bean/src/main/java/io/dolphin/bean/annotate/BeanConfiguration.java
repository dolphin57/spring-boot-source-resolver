package io.dolphin.bean.annotate;

import io.dolphin.bean.entity.Animal;
import io.dolphin.bean.entity.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean("dog")
    Animal getDog() {
        return new Dog();
    }
}
