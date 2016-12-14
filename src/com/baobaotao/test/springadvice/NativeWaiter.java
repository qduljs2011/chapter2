package com.baobaotao.test.springadvice;

public class NativeWaiter implements Waiter{

	@Override
	public void greetTo(String name) {
		System.out.println("greet:"+name);
	}

	@Override
	public void serviceTo(String name) {
		System.out.println("service:"+name);
	}

}
