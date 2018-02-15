package com.baobaotao.test.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Random;

public class CanvasStudy {
	private final String RECT_SHAPE="RECT";
	private final String OVAL_SHAPE="oval";
	private Frame f=new Frame("简单绘图");
	private Button rect=new Button("处置图形");
	private Button oval=new Button("oval");
	private MyCanvas drawArea=new MyCanvas();
	private String shape="";
	public void init(){
		Panel p =new Panel();
		rect.addActionListener(e->{
			shape=RECT_SHAPE;
			drawArea.repaint();
		});
		oval.addActionListener(e->{
			shape=OVAL_SHAPE;
			drawArea.repaint();
		});
		p.add(rect);
		p.add(oval);
		drawArea.setPreferredSize(new Dimension(250,180));
		f.add(drawArea);
		f.add(p,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new CanvasStudy().init();
	}
	class MyCanvas extends Canvas{
		public void paint(Graphics g){
			Random rand =new Random();
			if(shape.equals(RECT_SHAPE)){
				//设置画笔颜色
				g.setColor(new Color(220,100,80));
				g.drawRect(rand.nextInt(200), rand.nextInt(120), 40, 60);
			}
			if(shape.equals(OVAL_SHAPE)){
				g.setColor(new Color(80,100,200));
				g.fillOval(rand.nextInt(200), rand.nextInt(120), 50, 40);
			}
		}
	}
}
