package com.baobaotao.test.conftest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import com.baobaotao.test.Car;

@Configuration
public class AnimalConfig {
	@Bean
	public Car getCar(){
		return new Car();
	}
}
