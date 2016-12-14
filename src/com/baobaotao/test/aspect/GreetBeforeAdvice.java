package com.baobaotao.test.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class GreetBeforeAdvice implements MethodBeforeAdvice{
	private int i=1;
	@Override
	public void before(Method paramMethod, Object[] paramArrayOfObject,
			Object paramObject) throws Throwable {
		System.out.println(paramObject.getClass().getName()+paramMethod.getName());
		System.out.println("我是一个拦截:你好:"+(++i)+":"+paramArrayOfObject[0]);
	}

}
