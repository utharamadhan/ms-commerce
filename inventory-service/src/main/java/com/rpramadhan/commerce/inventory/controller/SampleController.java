package com.rpramadhan.commerce.inventory.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class SampleController {
	
	@Value("${message}")
	private String message;
	
	@RequestMapping(method=RequestMethod.GET, value="/message")
	public String getMessage() {
		return message;
	}

}
