package com.baobaotao.test.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class GreetBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method paramMethod, Object[] paramArrayOfObject,
			Object paramObject) throws Throwable {
		System.out.println("你好:"+paramArrayOfObject[0]);
	}

}
