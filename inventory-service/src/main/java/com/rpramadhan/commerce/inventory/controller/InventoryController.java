package com.rpramadhan.commerce.inventory.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rpramadhan.commerce.inventory.model.Item;
import com.rpramadhan.commerce.inventory.model.Response;

@RefreshScope
@RestController
@RequestMapping("/item")
public class InventoryController {
	
	@RequestMapping(method=RequestMethod.GET, value="/getAll")
	public Response getItems() {
		Response resp = new Response();
		List<Item> items = new ArrayList<>();
			items.add(Item.createInstance(1L, "y1x7Z", "Outliers"));
			items.add(Item.createInstance(1L, "vA5mp", "How to Win Friends and Influence People"));
			items.add(Item.createInstance(1L, "u0L1d", "Getting Started with Spring Boot"));
		resp.setResponseCode("00");
		resp.setResponseDesc("success");
		resp.setResult(items);
		return resp;
	}

}
