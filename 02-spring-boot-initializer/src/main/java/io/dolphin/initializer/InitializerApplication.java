package io.dolphin.initializer;

import io.dolphin.initializer.initializer.SecondInitializer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.dolphin.initializer.mapper")
public class InitializerApplication {

    public static void main(String[] args) {
        //SpringApplication.run(InitializerApplication.class, args);
        SpringApplication springApplication = new SpringApplication(InitializerApplication.class);
        springApplication.addInitializers(new SecondInitializer());
        springApplication.run(args);
    }

}
