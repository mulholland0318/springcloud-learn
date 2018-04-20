package com.springcloudconfigclient.springcloudconfigdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class SpringcloudConfigDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigDemoApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}




	@Value("${name}") // git配置文件里的key
	String myww ;

	@RequestMapping(value = "/hi")
	public String hi(){
		return myww;
	}
}
