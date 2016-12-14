package com.baobaotao.test.proxy;

import java.sql.SQLException;

public interface UpdateService {
	void save(int id) throws Exception;
	void update(int id);
}
