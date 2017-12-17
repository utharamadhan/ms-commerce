package com.rpramadhan.commerce.configservice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author rpramadhan
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServiceMain {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConfigServiceMain.class, args);
	}

}
