package gui.wackamole;

import gui.components.Components;

import java.awt.Color;
import java.awt.Graphics2D;
public class Player extends Components implements PlayerInterface {

	private int score;

	public Player() {
		// TODO Auto-generated constructor stub
		super(20,20,100,100);
	}

	@Override
	public void increaseScore(int i) {
		// TODO Auto-generated method stub
		score+= i;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.drawOval(0, 0, 99, 99);
		g.drawString("Score =" + score, 40, 55);
	}

}
