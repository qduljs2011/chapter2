package com.baobaotao.test.aspectLan;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TestAspect {
	@AfterReturning("@annotation(com.baobaotao.test.aspectLann.NeedTest)")
	public void needTestFun(){
		System.out.println("needTestFun execution()");
	}
}
