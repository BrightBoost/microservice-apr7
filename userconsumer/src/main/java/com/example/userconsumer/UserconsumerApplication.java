package com.example.userconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserconsumerApplication.class, args);
	}

}
