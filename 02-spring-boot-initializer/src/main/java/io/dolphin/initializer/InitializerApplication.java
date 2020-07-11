package io.dolphin.initializer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.dolphin.initializer.mapper")
public class InitializerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InitializerApplication.class, args);
    }

}
