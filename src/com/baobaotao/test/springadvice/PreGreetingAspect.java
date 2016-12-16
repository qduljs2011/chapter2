package com.baobaotao.test.springadvice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PreGreetingAspect {
	//@annotation( com.baobaotao.test.springadvice.IsTest)
	//args(com.baobaotao.test.springadvice.Waiter) //包含所有的Waiter以及子类
	//execution(* greetTo(..))
	//@args(com.baobaotao.test.springadvice.IsNull)//代表的方法对应的形参是否是有注解修饰
	//within(com.baobaotao.test.springadvice.Waiter)
	@Before("within(com.baobaotao.test.springadvice.NativeWaiter)")
	public void beforGreeting(){
		System.out.println("how  are you!");
	}
}
