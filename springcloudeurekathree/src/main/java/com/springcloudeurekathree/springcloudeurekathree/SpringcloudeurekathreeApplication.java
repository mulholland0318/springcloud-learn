package com.springcloudeurekathree.springcloudeurekathree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudeurekathreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudeurekathreeApplication.class, args);
	}
}
