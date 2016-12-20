package com.baobaotao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.baobaotao.dao.LoginLogDao;
import com.baobaotao.dao.UserDao;
import com.baobaotao.domain.TLoginLog;
import com.baobaotao.domain.TUser;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private LoginLogDao  loginLogDao;
	public boolean hasMatcher(String username,String password){
		int i=userDao.getMatchCount(username, password);
		if(i>0) return true;
		return false;
	}
	public TUser getUserByName(String userName){
		return userDao.findUserByUsername(userName);
	}
	public void loginSuccess(TUser user){
		user.setCredits(5+user.getCredits());
		TLoginLog log=new TLoginLog();
		log.setUserId(user.getUserId());
		log.setIp(user.getLastIp());
		log.setLoginDatetime(user.getLastVisit());
		userDao.updateLoginInfo(user);
		loginLogDao.insertLoginLog(log);
	}
	public void createUser(TUser user) {
		userDao.saveUser(user);
	}
}
