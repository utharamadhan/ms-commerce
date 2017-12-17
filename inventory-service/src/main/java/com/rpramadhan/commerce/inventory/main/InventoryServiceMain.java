package com.rpramadhan.commerce.inventory.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author rpramadhan
 */
@SpringBootApplication
@ComponentScan("com.rpramadhan.commerce.inventory")
public class InventoryServiceMain {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(InventoryServiceMain.class, args);
	}

}
