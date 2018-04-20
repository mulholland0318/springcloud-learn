package com.springcloudeureka.eurekatestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaTestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaTestDemoApplication.class, args);
	}
}
