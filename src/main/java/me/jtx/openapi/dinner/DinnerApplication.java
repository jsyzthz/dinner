package me.jtx.openapi.dinner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import me.jtx.openapi.dinner.service.DemoService;

@SpringBootApplication
public class DinnerApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DinnerApplication.class, args);
		ApplicationContext applicationContext = SpringApplication.run(DinnerApplication.class, args);
        applicationContext.getBean(DemoService.class).demo();
	}
}
