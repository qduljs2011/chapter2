package com.baobaotao.test.autotest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bird implements Animal{
	@Value("${color}")
	private String name;
	@Override
	public void move() {
		System.out.println("我用翅膀飞");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
