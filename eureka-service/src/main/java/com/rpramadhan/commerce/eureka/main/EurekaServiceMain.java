package com.rpramadhan.commerce.eureka.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author rpramadhan
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceMain {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaServiceMain.class, args);
	}

}
