package io.dolphin.listener;

import io.dolphin.listener.customlistener.SecondListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListenerApplication {
	public static void main(String[] args) {
//		SpringApplication.run(ListenerApplication.class, args);
		SpringApplication springApplication = new SpringApplication(ListenerApplication.class);
		springApplication.addListeners(new SecondListener());
		springApplication.run();
	}
}
