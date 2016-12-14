package com.baobaotao.test.aspect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class GreetingDynamicPointCut extends DynamicMethodMatcherPointcut{
	private static List<String> specialList=new ArrayList<>();
	static{
		specialList.add("mayun");
		specialList.add("lijiacheng");
	}
	@Override
	public boolean matches(Method arg0, Class<?> arg1, Object[] arg2) {
		System.out.println("对方法:"+arg0.getName()+"参数进行动态检查");
		return specialList.contains(arg2[0]);
	}
	
	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		System.out.println("对"+method.getName()+"进行静态检查,");
		return "greetTo".equals(method.getName());
	}

	@Override
	public ClassFilter getClassFilter() {
		return new ClassFilter() {
			@Override
			public boolean matches(Class<?> arg0) {
				System.out.println("调用类过滤器，对"+arg0.getName()+"进行过滤");
				return Waitrees.class.isAssignableFrom(arg0);
			}
		};
	}
	
	
}
