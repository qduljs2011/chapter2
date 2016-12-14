package com.baobaotao.domain;

import java.sql.Timestamp;

/**
 * TLoginLog entity. @author MyEclipse Persistence Tools
 */

public class TLoginLog implements java.io.Serializable {

	// Fields

	private Integer loginLogId;
	private Integer userId;
	private String ip;
	private Timestamp loginDatetime;

	// Constructors

	/** default constructor */
	public TLoginLog() {
	}

	/** full constructor */
	public TLoginLog(Integer userId, String ip, Timestamp loginDatetime) {
		this.userId = userId;
		this.ip = ip;
		this.loginDatetime = loginDatetime;
	}

	// Property accessors

	public Integer getLoginLogId() {
		return this.loginLogId;
	}

	public void setLoginLogId(Integer loginLogId) {
		this.loginLogId = loginLogId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Timestamp getLoginDatetime() {
		return this.loginDatetime;
	}

	public void setLoginDatetime(Timestamp loginDatetime) {
		this.loginDatetime = loginDatetime;
	}

}