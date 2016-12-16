package gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gui.components.Visible;

public abstract class Screen {

	private BufferedImage image;
	private ArrayList<Visible> viewObjects;
	
	public abstract void initObjects(ArrayList<Visible> viewObjects);
	
	public Screen(int width, int height) {
		// TODO Auto-generated constructor stub
		viewObjects = new ArrayList<Visible>();
		initImage(width, height);
	}
	
	public BufferedImage getImage(){
		return image;
	}
	
	public int getWidth(){
		return image.getWidth();
	}
	
	public int getHeight(){
		return image.getHeight();
	}

	public void initImage(int width, int height) {
		// TODO Auto-generated method stub
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public void update() {
		// TODO Auto-generated method stub
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//		g.setColor(Color.pink);
//		g.fillRect(0, 0, image.getWidth(), image.getHeight());
//		g.setColor(Color.black);
//		g.drawString("Hello World", 40, 100);
//		g.drawOval(20, 70, 100, 50);
		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.black);
		
		for(Visible v: viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
			
		}
	}
	
	
	public MouseMotionListener getMouseMotionListener(){
		return null;
	}
	
	public MouseListener getMouseListener(){
		return null;
	}

}
