package com.baobaotao.test.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class PeopleAdvisor {
	@DeclareParents(value = "com.baobaotao.test.aspectj.Poster",defaultImpl=Apple.class)
	public Fruit fruit;
}
