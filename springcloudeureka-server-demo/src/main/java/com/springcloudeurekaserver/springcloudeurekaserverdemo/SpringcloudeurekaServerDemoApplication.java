package com.springcloudeurekaserver.springcloudeurekaserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudeurekaServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudeurekaServerDemoApplication.class, args);
	}
}
