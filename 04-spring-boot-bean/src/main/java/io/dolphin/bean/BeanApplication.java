package io.dolphin.bean;

import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class BeanApplication {

    public static void main(String[] args) {
//        SpringApplication.run(BeanApplication.class, args);
        SpringApplication springApplication = new SpringApplication(BeanApplication.class);
        springApplication.setBanner(new ResourceBanner(new ClassPathResource("banner_bak.txt")));
        springApplication.run(args);
    }

}
