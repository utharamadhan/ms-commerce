package com.rpramadhan.commerce.order.model;

import java.io.Serializable;

public class Item implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 85436048105352036L;
	
	public static Item createInstance(Long id, String code, String name) {
		Item it = new Item();
		it.setId(id);
		it.setCode(code);
		it.setName(name);
		return it;
	}

	private Long id;
	
	private String code;
	
	private String name;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
