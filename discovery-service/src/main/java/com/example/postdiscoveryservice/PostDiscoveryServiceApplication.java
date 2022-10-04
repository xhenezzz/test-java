package com.example.postdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PostDiscoveryServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(PostDiscoveryServiceApplication.class, args);
	}

}
