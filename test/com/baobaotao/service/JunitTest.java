package com.baobaotao.service;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JunitTest {
	private SimpleDateFormat simpleDateFormat;
	private String date;
	private String dateformat;
	private String expectedDate;
	public JunitTest(String date, String dateformat, String expectedDate) {
		this.date = date;
		this.dateformat = dateformat;
		this.expectedDate = expectedDate;
	}
	
	@Parameters
	public static Collection getParamters(){
		String[][] object={{"2016-12-20 18:14:18","yyyyMMdd","201612"},{"2016-12-20 18:14:53","yyyy年MM月dd日","2016年12月20日"},{"2016-12-20 18:16:03","HH分mm分ss秒","18时16分3秒"}};
		return Arrays.asList(object);
	}
	
}
