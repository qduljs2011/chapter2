package com.baobaotao.test.springadvice;

import org.springframework.aop.framework.ProxyFactory;

public class AdviceTest {
	public static void main(String[] args) {
		Waiter waiter=new NativeWaiter();
		ProxyFactory factory=new ProxyFactory();
		factory.setTarget(waiter);
		factory.addAdvice(new MyMethodBeforeAdvice());
		Waiter proxy=(Waiter)factory.getProxy();
		proxy.greetTo("miss 李");
		proxy.serviceTo("miss ilu");
	}
}
