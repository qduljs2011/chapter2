package com.baobaotao.test.proxy;

import java.sql.SQLException;

public class UpdateServiceImpl implements UpdateService{

	@Override
	public void save(int id) throws Exception {
		System.out.println("保存方法");
		throw new SQLException("sql参数有问题!");
	}

	@Override
	public void update(int id) {
		System.out.println("更新方法");
		//throw new RuntimeException("跑出异常!");
	}

}
