package com.baobaotao.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
	@Bean(name="car")
	public Car buildCar(){
		Car car=new Car();
		car.setBrand("测试品牌");
		car.setColor("红色");
		car.setMaxSpeed(100);
		return car;
	}
}
