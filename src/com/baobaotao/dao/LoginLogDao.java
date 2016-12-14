package com.baobaotao.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.TLoginLog;

@Repository
public class LoginLogDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public  void insertLoginLog(TLoginLog log){
		String sqlStr="insert into t_login_log(user_id,ip,login_datetime) values(?,?,?) ";
		jdbcTemplate.update(sqlStr, new Object[]{log.getUserId(),log.getIp(),log.getLoginDatetime()});
	}
}
