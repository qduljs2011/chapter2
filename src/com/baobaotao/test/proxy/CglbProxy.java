package com.baobaotao.test.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglbProxy implements MethodInterceptor{
	private Enhancer enhancer=new Enhancer();
	public Object  getProxy(Class clazz){
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		MethodMonitor.begin(arg1.getName());
		Object obj=arg3.invokeSuper(arg0, arg2);
		MethodMonitor.end();
		return obj;
	}

}
