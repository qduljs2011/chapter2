package com.baobaotao.test.awt;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class HandDraw {
	private final int AREEA_WIDTH=500;
	private final int AREA_HEIGHT=400;
	private int preX=-1;
	private int preY=-1;
	PopupMenu pop=new PopupMenu();
	MenuItem redItem=new MenuItem("红色");
	MenuItem greeenItem=new MenuItem("绿色");
	MenuItem blueItem=new MenuItem("黄色");
	BufferedImage image=new BufferedImage(AREEA_WIDTH, AREA_HEIGHT, BufferedImage.TYPE_INT_RGB);
	Graphics g=image.getGraphics();
	private Frame f=new Frame("简单收回程序");
	//
	private DrawCanvas drawArea=new DrawCanvas();
	
	private Color foreColor=new Color(255,0,0);
	public void init(){
		ActionListener menuListener=e->{
			if("绿色".equals(e.getActionCommand())){
				foreColor=new Color(0,255,0);
			}else if("红色".equals(e.getActionCommand())){
				foreColor=new Color(255,0,0);
			}else if("蓝色".equals(e.getActionCommand())){
				foreColor=new Color(0,0,255);
			}
		};
		redItem.addActionListener(menuListener);
		greeenItem.addActionListener(menuListener);
		blueItem.addActionListener(menuListener);
		pop.add(redItem);
		pop.add(greeenItem);
		pop.add(blueItem);
		//
	}
	class DrawCanvas extends Canvas{
		@Override
		public void paint(Graphics g) {
			g.drawImage(image, 0, 0, null);
		}
	}
	
}
