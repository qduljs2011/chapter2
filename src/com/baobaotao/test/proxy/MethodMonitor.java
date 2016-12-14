package com.baobaotao.test.proxy;

public class MethodMonitor {
	private static ThreadLocal<MethodPerformance> performanceRecord=new ThreadLocal<>();
	public static void begin(String methodName){
		MethodPerformance performance=new MethodPerformance(methodName);
		performanceRecord.set(performance);
	}
	public static void end(){
		MethodPerformance performance=performanceRecord.get();
		performance.performance();
	}
}
