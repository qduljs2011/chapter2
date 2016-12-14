package com.baobaotao.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class ResourceTest {
	public static void main(String[] args) {
		new ResourceTest().test1();
	}
	public void test1(){
		ResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();
		 Resource  resource= resolver.getResource("classpath:baobaotao-servlet.xml");
		System.out.println(resource.getDescription());
	}
}
