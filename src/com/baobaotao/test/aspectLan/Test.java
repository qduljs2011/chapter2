package com.baobaotao.test.aspectLan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		new Test().test();
	}
	public void test(){
		ApplicationContext context=new ClassPathXmlApplicationContext("com/baobaotao/test/aspectLan/aspectLan.xml");
		NativeWaiter nWaiter=context.getBean("nativeWaiter",NativeWaiter.class);
		NaughtyWaiter waiter=context.getBean("naughtyWaiter",NaughtyWaiter.class);
		nWaiter.greeTo("xuyundashi");
		nWaiter.smile("123", 12);
	}
	public void test2(){
		ApplicationContext context=new ClassPathXmlApplicationContext("com/baobaotao/test/aspectLan/aspectLan.xml");
		NativeWaiter nWaiter=context.getBean("nativeWaiter",NativeWaiter.class);
		nWaiter.greeTo("123");
	}
}
