package com.baobaotao.test.aspectLan;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TestAspect {
	//@annotation( com.baobaotao.test.aspectLan.NeedTest)
	@AfterReturning("execution(* com.baobaotao.test.aspectLan.Waiter+.*(..))")
	public void needTestFun(){
		System.out.println("needTestFun execution()");
	}
}
