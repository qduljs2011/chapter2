package com.baobaotao.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory paramConfigurableListableBeanFactory)
			throws BeansException {
		BeanDefinition bd=paramConfigurableListableBeanFactory.getBeanDefinition("car");
		bd.getPropertyValues().addPropertyValue("brand", "江山牌");
		System.out.println("调用BeanFactoryPostProcessor的方法,将品牌设置为江山牌！");
	}

}
