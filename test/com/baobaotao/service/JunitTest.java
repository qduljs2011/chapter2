package com.baobaotao.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import  org.junit.Assert;
import org.junit.Test;
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
		String[][] object={{"2016-12-20 18:14:18","yyyyMMdd","20161220"},{"2016-12-20 18:14:53","yyyy年MM月dd日","2016年12月20日"},{"2016-12-20 18:16:03","HH时mm分ss秒","18时16分03秒"}};
		return Arrays.asList(object);
	}
	
	@Test
	public void testSimpleDateFormate() throws ParseException{
		simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d=simpleDateFormat.parse(this.date);
		simpleDateFormat=new SimpleDateFormat(this.dateformat);
		String result=simpleDateFormat.format(d);
		System.out.println(this.expectedDate+"||"+result);
		Assert.assertEquals(this.expectedDate, result);
	}
}
