package com.baobaotao.test.aspectj;

public class Apple implements Fruit{

	@Override
	public void growUp() {
		System.out.println("苹果树正在成长!");
	}
	@Override
	public void getName() {
		System.out.println("我是苹果树!");
	}

}
