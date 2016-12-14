package com.baobaotao.test;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

public class MyInstantiationAwarebeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter{

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass,
			String beanName) throws BeansException {
		if("car".equals(beanName)){
			System.out.println("实例化之前调用InstantiationAwareBeanPostProcessorAdapter的postProcessBeforeInstantiation方法;");
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName)
			throws BeansException {
		if("car".equals(beanName)){
			System.out.println("实例化之后调用InstantiationAwareBeanPostProcessorAdapter的postProcessAfterInstantiation()方法");
		}
		return true;
	}

	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs,
			PropertyDescriptor[] pds, Object bean, String beanName)
			throws BeansException {
		if("car".equals(beanName)){
			System.out.println("设置某个属性值是调用InstantiationAwareBeanPostProcessorAdapter的postProcessPropertyValues()方法");
		}
		return pvs;
	}
	
}
