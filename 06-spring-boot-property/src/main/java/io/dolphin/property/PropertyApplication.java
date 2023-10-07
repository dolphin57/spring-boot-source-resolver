package io.dolphin.property;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.util.Properties;

@SpringBootApplication
@PropertySource({"demo.properties"})
public class PropertyApplication {

    public static void main(String[] args) {
//        SpringApplication.run(PropertyApplication.class, args);
        SpringApplication springApplication = new SpringApplication(PropertyApplication.class);
        Properties properties = new Properties();
        properties.setProperty("dolphin.url", "dolphin.com");
        springApplication.setDefaultProperties(properties);
        springApplication.run(args);
    }

}
