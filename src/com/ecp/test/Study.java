package com.ecp.test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Study {
	private String name;// 学生姓名；
	
	public void test1(){
		Frame f=new Frame("测试的框架");
		f.setLayout(new BorderLayout(30,5));
		f.add(new Button("北"), BorderLayout.NORTH);
		f.add(new Button("南"), BorderLayout.SOUTH);
		f.add(new Button("中"));
		f.add(new Button("东"), BorderLayout.EAST);
		f.add(new Button("西"), BorderLayout.WEST);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Study().test1();
	}
}
