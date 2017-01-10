package gui.wackamole;

import gui.components.Action;
import gui.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {
	
	private int appearanceTime;
	
	public Mole(int x, int y) {
		super(x, y, 0.3, "resources/sampleImages/runscape_mole.png");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getAppearanceTime() {
		// TODO Auto-generated method stub
		return appearanceTime;
	}

	@Override
	public void setAppearanceTime(int screenTime) {
		// TODO Auto-generated method stub
		appearanceTime = screenTime;
	}

}
