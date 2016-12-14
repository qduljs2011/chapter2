package com.baobaotao.test.springadvice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {
	public void afterThrowing(Method method,Object[]args,Object target,Exception ex) throws Throwable{
		System.out.println("------------------");
		System.out.println(method.getName());
		System.out.println("跑出异常:"+ex.getMessage());
		System.out.println("shiwuhuigun");
	}
}
