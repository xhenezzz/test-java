package com.example.postofficeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@ComponentScan
public class PostOfficeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostOfficeApiApplication.class, args);
	}

}
