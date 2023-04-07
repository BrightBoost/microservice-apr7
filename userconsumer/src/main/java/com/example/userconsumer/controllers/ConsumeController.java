package com.example.userconsumer.controllers;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("consume")
public class ConsumeController {

    private DiscoveryClient discoveryClient;
    public ConsumeController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/consumeUser")
    public void consumerGetUser() {
        List<ServiceInstance> instances = discoveryClient.getInstances("user-producer");
        String url = instances.get(0).getUri().toString();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = null;
        try {
            response = restTemplate.exchange(url + "/getUser", HttpMethod.GET, new HttpEntity<>(httpHeaders), String.class);
        } catch (RestClientException rce) {
            System.out.println(rce);
        }
        System.out.println(response.getBody() + " status: " + response.getStatusCode());
    }
}
