package com.baobaotao.test.aspectLan;

import com.baobaotao.test.springadvice.NativeWaiter;

public class NaughtyWaiter extends NativeWaiter {

	@Override
	@NeedTest
	public void greetTo(String name) {
		// TODO Auto-generated method stub
		super.greetTo(name);
	}

	@Override
	public void serviceTo(String name) {
		// TODO Auto-generated method stub
		super.serviceTo(name);
	}
	public void joke(String clientName,int times){
		
	}
}
