package com.baobaotao.test.springadvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg) throws Throwable {
		Object[] params=arg.getArguments();
		System.out.println("hello:"+params[0]);
		Object obj=arg.proceed();
		System.out.println("enjoy your self!"+params[0]);
		return obj;
	}

}
