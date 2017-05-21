package com.lovego;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(UserServiceApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
}
