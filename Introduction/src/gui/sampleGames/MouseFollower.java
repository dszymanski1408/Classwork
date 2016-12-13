package gui.sampleGames;

import gui.GUIApplication;
import gui.screens.CoordinateScreen;

import java.awt.Graphics2D;
import java.awt.MouseInfo;

public class MouseFollower extends GUIApplication {

	private CoordinateScreen cs;
	
	
	public MouseFollower(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		cs = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cs);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseFollower(800,600);
	}

}
