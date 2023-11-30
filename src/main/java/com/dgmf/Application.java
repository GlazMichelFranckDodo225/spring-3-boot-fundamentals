package com.dgmf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @SpringBootConfiguration ==> @Configuration ==> @Component
// @EnableAutoConfiguration
// @ComponentScan
@SpringBootApplication
public class Application {
	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(Application.class, args);

		HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
		System.out.println(helloWorld.hello());
	}

}
