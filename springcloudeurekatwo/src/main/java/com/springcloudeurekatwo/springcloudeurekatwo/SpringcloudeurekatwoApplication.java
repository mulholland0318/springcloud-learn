package com.springcloudeurekatwo.springcloudeurekatwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudeurekatwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudeurekatwoApplication.class, args);
	}
}
