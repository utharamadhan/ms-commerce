package com.rpramadhan.commerce.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rpramadhan.commerce.order.model.Response;

@RefreshScope
@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private ResponseEntity<Response> getItemsFallback() {
		Response resp = new Response();
			resp.setResponseCode("04");
			resp.setResponseDesc("not found");
		return ResponseEntity.ok().body(resp);
	}
	
	@HystrixCommand(fallbackMethod="getItemsFallback")
	@RequestMapping(method=RequestMethod.GET, value="/getListItems")
	public ResponseEntity<Response> getItems() {
		return restTemplate.exchange("http://INVENTORY-SERVICE/item/getAll", HttpMethod.GET, null, Response.class);
	}

}
