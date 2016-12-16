package com.baobaotao.test.aspectLan;

public class NaughtyWaiter implements Waiter {

	public void joke(String clientName,int times){
		System.out.println("给"+clientName+"讲个笑话，花费了时间Wie"+times);
	}
	@NeedTest
	@Override
	public void greeTo(String clientName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void serveTo(String clientName) {
		// TODO Auto-generated method stub
		
	}
}
