package com.baobaotao.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class Car implements BeanFactoryAware,BeanNameAware,InitializingBean,DisposableBean {
	private String brand;
	private String color;
	private double maxSpeed;
	private BeanFactory beanFactory;
	private String beanName;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		System.out.println("调用了brand的set方法!!!!!!!!!!!!!!!!!!");
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public static void main(String[] args) {
		InstantiationAwareBeanPostProcessor sdf;
		BeanPostProcessor brea;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("调用DisposableBean的destroy()方法");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("调用InitializingBean.afterPropertiesSet()的方法");
	}
	@Override
	public void setBeanName(String paramString) {
		System.out.println("实现BeanNameAware的setBeanName方法.");
		this.beanName=paramString;
		
	}
	@Override
	public void setBeanFactory(BeanFactory paramBeanFactory)
			throws BeansException {
		System.out.println("实现BeanFactoryAware的setBeanFactory方法.");
		this.beanFactory=paramBeanFactory;
	}
	//释放资源的方法
	public void myDestroy(){
		System.out.println("调用配置的释放资源的方法");
	}
	//初始化方法
	public void myInit(){
		System.out.println("调用配置的初始化的方法!将速度设置为200");
		this.maxSpeed=200;
	}
	public BeanFactory getBeanFactory() {
		return beanFactory;
	}
	public String getBeanName() {
		return beanName;
	}
	@Override
	public String toString() {
		return "brand="+this.brand+",color="+this.color+",speed="+this.maxSpeed+"beanName="+this.beanName;
	}
	
}
