//package com.example.usergatewayservice;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SpringCloudConfig {
//    @Bean
//    public RouteLocator configureRoute(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("USER-PRODUCER", r->r.path("/produce/**").uri("http://localhost:8080")) //static routing
//                .route("USER-CONSUMER", r->r.path("/consume/**").uri("lb://user-consumer")) //dynamic routing
//                .build();
//    }
//}
