package com.lovego;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MonitorApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(MonitorApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
}
