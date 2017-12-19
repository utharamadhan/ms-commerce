package com.rpramadhan.commerce.order.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * @author rpramadhan
 */
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.rpramadhan.commerce.order")
public class OrderServiceMain {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(OrderServiceMain.class, args);
	}
	
	@LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
