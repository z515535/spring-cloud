package com.lovego;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableWebMvc
@EnableCircuitBreaker
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(WebApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
}
