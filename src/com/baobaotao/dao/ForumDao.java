package com.baobaotao.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.Forum;

@Repository
public class ForumDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void addForum(Forum forum){
		
	}
}
