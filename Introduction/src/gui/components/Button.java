package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel implements Clickable {
	
	private Color color;
	private Action action;
	
	
	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		// TODO Auto-generated constructor stub
		this.color = color;
		this.action = action;
		update();
		
	}
	
	public Color getColor(){
		return color;
	}
	
	public void setColor(Color c){
		color = c;
		update();
	}
	
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(color);
		g.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), 25, 35);
		g.setColor(Color.black);
		g.drawRoundRect(1, 1, this.getWidth()-1, this.getHeight()-1, 25, 35);
		g.setFont(new Font(getFont(), Font.PLAIN, getSize()));
	}

	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return ((x < this.getX() + this.getWidth()) && (x > this.getX()) 
				&& (y < this.getY() + this.getHeight()) && (y > this.getY()));
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		action.act();
	}
	
	
}
