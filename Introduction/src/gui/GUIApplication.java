package gui;

import java.awt.Graphics;

import javax.swing.JFrame;

public class GUIApplication extends JFrame{
//fields
	private Screen currentScreen;
	
	//demo only 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUIApplication(800,600);
	}
	
	public GUIApplication(int width, int height){
		super();
		setBounds(20, 20, width, height);
		//terminates program when window is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initScreen();
		setVisible(true);
	}

	public void initScreen() {
		// TODO Auto-generated method stub
		currentScreen = new Screen(getWidth(), getHeight());
	}
	
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
}
