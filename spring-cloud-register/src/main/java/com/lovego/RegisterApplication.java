package com.lovego;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 注册中心启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(RegisterApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
}
