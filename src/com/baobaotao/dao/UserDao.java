package com.baobaotao.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.TUser;

@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public int getMatchCount(String name,String password){
		String sql="select count(*) from t_user where user_name=? and pass_word=?";
		//return jdbcTemplate.queryForInt(sql, new Object[]{name,password});
		return jdbcTemplate.queryForObject(sql,new Object[]{name,password},Integer.class);
	}
	public TUser findUserByUsername(String name){
		String sql="select * from t_user where user_name=?";
		final TUser user=new TUser();
		jdbcTemplate.query(sql, new Object[]{name}, new RowCallbackHandler() {
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				user.setUserId(rs.getInt("user_id"));
				user.setUserName(rs.getString("user_name"));
				user.setCredits(rs.getInt("credits"));
				user.setPassword(rs.getString("pass_word"));
				user.setLastIp(rs.getString("last_ip"));
				user.setLastVisit(rs.getTimestamp("last_visit"));
			}
		});
		return user;
	}
	public void updateLoginInfo(TUser user){
		String sqlStr="update t_user set credits=?,last_visit=?,last_ip=? where user_id=?";
		jdbcTemplate.update(sqlStr, new Object[]{user.getCredits(),user.getLastVisit(),user.getLastIp(),user.getUserId()});
	}
	public void saveUser(TUser user) {
		String sqlStr="insert into t_user(user_name,pass_word,last_visit) values(?,?,now())";
		jdbcTemplate.update(sqlStr, user.getUserName(),user.getPassword());
	}
}
