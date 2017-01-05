package gui.wackamole;

import gui.components.Action;
import gui.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {
	
	public Mole(int x, int y) {
		super(x, y, 0.9, "resources/sampleImages/runscape_mole.png");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getAppearanceTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAppearanceTime(int screenTime) {
		// TODO Auto-generated method stub

	}

}
