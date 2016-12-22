package gui.components;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClickableGraphic extends Graphic implements Clickable{
	
	private Action act;
	private int x;
	private int y;

	public ClickableGraphic(int x, int y, String imageLocation, Action action) {
		super(x, y, imageLocation);
		// TODO Auto-generated constructor stub\
		this.x = x;
		this.y = y;
		setAction(action); 
	}

	public ClickableGraphic(int x, int y, int w, int h, String imageLocation, Action action) {
		super(x, y, w, h, imageLocation);
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		setAction(action); 
	}

	public ClickableGraphic(int x, int y, double scale, String imageLocation, Action action) {
		super(x, y, scale, imageLocation);
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		setAction(action); 
	}

	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return x>getX() && x<getX()+getWidth() && 
				y > getY() && y<getY()+getHeight();
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		if(this.act != null){
			this.act.act();
		}
	}
	
	public void setAction(Action a){
		a = act;
	}
	

}
