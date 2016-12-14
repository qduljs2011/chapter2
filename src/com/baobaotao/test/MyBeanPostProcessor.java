package com.baobaotao.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object paramObject,
			String paramString) throws BeansException {
		if("car".equals(paramString)){
			Car car=(Car)paramObject;
			if(car.getColor()==null){
				car.setColor("黑色");
				System.out.println("通过调用后置处理器的postProcessBeforeInitialization()将car的颜色设置为黑色!");
			}
		}
		return paramObject;
	}

	@Override
	public Object postProcessAfterInitialization(Object paramObject,
			String paramString) throws BeansException {
		if("car".equals(paramString)){
			Car car=(Car)paramObject;
			if(car.getColor()==null){
				car.setMaxSpeed(250);
				System.out.println("通过调用后置处理器的postProcessAfterInitialization)将car的速度设置为250!");
			}
		}
		return paramObject;
	}

}
