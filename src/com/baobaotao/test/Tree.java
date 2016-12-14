package com.baobaotao.test;

public class Tree {
	private Car car;
	private String iDCode;
	
	private String name;
	
	public Tree(){
	}
	public Tree(String iDCode, String name) {
		this.iDCode = iDCode;
		this.name = name;
	}

	public Tree(Car car, String iDCode, String name) {
		super();
		this.car = car;
		this.iDCode = iDCode;
		this.name = name;
	}
	public String getiDCode() {
		return iDCode;
	}

	public void setiDCode(String iDCode) {
		this.iDCode = iDCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
}
