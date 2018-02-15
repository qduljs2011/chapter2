package com.baobaotao.test.asw;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextField;


public class AwtTest {
	
	public void method1(){
		Frame f=new Frame("测试窗口");
		f.setBounds(30, 30, 250, 120);
		f.setVisible(true);
		Panel p=new Panel();
		p.add(new TextField(20));
		p.add(new Button("点击我"));
		f.add(p);
		
	}
	public void method2(){
		Frame f=new Frame("框架");
		ScrollPane sp=new ScrollPane();
		sp.add(new TextField(20));
		sp.add(new Button("单击我"));
		f.add(sp);
		f.setBounds(30, 30, 250, 120);
		f.setVisible(true);
	}
	public void method3(){
		Frame f=new Frame("测试窗口");
		f.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 5));
		for(int i=0;i<20;i++){
			f.add(new Button("按钮"+i));
		}
		f.pack();
		f.setVisible(true);
	}
	public void method4(){
		Frame f=new Frame("测试窗口");
		f.setLayout(new BorderLayout(10,20));
		f.add(new Button("南"), BorderLayout.SOUTH);
		f.add(new Button("北"),BorderLayout.NORTH);
		f.add(new Button("中"),BorderLayout.CENTER);
		f.add(new Button("东"),BorderLayout.EAST);
		f.add(new Button("西"),BorderLayout.WEST);
		f.pack();
		f.setVisible(true);
	}
	public void method5(){
		Frame f=new Frame("计算器");
		f.setLayout(new BorderLayout(10, 20));
		Panel panel=new Panel();
		panel.add(new TextField(20));
		f.add(panel, BorderLayout.NORTH);
		Panel panelN=new Panel(new GridLayout(3, 5, 4, 4));
		String[] names={
		"0","1","2","3","4","5","6","7","8","9","+","-","*","/","."
		};
		for(int i=0;i<15;i++){
			panelN.add(new Button(names[i]));
		}
		f.add(panelN);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new AwtTest().method5();
	}
}
