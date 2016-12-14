package com.baobaotao.test.proxy;

import java.lang.reflect.Proxy;
import java.sql.SQLException;

public class ProxyTest {
	public static void main(String[] args) throws Exception {
		UpdateServiceImpl service=(UpdateServiceImpl)new CglbProxy().getProxy(UpdateServiceImpl.class);
		//UpdateService proxy=(UpdateService)Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(), new PerformanceHandler(service));
		service.save(123);
		service.update(1);
	}
}
