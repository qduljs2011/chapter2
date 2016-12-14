package com.baobaotao.test.autotest;

import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal {

	@Override
	public void move() {
			System.out.println("我用四直腿跑");
	}

}
