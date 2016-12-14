package com.baobaotao.test.proxy;

public class MethodPerformance {
	private String methodName;
	private long start;
	private long end;
	
	
	public MethodPerformance(String methodName) {
		this.methodName = methodName;
		this.start = System.currentTimeMillis();
		System.out.println("开始了方法监控!");
	}
	public void performance(){
		this.end=System.currentTimeMillis();
		System.out.println("方法:"+methodName+"消耗了:"+(end-start)+"毫秒");
	}
	
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public long getStart() {
		return start;
	}
	public void setStart(long start) {
		this.start = start;
	}
	public long getEnd() {
		return end;
	}
	public void setEnd(long end) {
		this.end = end;
	}
	
	
}
