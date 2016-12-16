package com.baobaotao.test.aspectLan;

public class NativeWaiter implements Waiter{

	@Override
	public void greeTo(String clientName) {
		
	}

	@Override
	public void serveTo(String clientName) {
		
	}
	public void smile(String clientName,int time){
		System.out.println("笑着对"+clientName+"说:您花费了"+time);
	}
}
