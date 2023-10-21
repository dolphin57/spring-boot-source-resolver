package io.dolphin.mybatisredis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.dolphin.mybatisredis.mapper")
public class SpringBootMybatisRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisRedisApplication.class, args);
    }

}
