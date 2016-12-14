package com.baobaotao.test.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor{

	@Override
	public boolean matches(Method paramMethod, Class<?> paramClass) {
		return "greetTo".equals(paramMethod.getName());
	}

	@Override
	public ClassFilter getClassFilter() {
		return new ClassFilter() {
			@Override
			public boolean matches(Class<?> paramClass) {
				return Waitrees.class.isAssignableFrom(paramClass);
			}
		};
	}
	
}
