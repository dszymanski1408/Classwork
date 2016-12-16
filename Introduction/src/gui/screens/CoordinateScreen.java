package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener {
	
	private TextLabel text;
	private Button myButton;

	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		text = new TextLabel(20,200,500,40, "Some text");
		myButton = new Button(40,50,100,30,"Button",new Color(0,76,153), new Action(){
			public void act(){
			//code for action will be in here.
			}
			});
		viewObjects.add(text);
		viewObjects.add(myButton);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		text.setText("Mouse at: " + mx + "," + my);
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

}
