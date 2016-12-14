package com.baobaotao.test.springadvice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyMethodAfter implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("Please enjoy your yourself!"+arg2[0]);
	}

}
