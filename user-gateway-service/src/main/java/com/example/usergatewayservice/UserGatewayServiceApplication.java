package com.example.usergatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserGatewayServiceApplication.class, args);
	}

}
