package com.example.userproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProducerApplication.class, args);
	}

}
