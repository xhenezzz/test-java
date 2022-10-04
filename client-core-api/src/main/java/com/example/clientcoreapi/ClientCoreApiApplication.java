package com.example.clientcoreapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class ClientCoreApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientCoreApiApplication.class, args);
	}

}
