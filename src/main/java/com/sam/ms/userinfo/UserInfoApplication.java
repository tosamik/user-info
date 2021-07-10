package com.sam.ms.userinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sam.ms"})
public class UserInfoApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserInfoApplication.class, args);
	}
}
