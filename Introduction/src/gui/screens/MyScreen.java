package gui.screens;

import java.util.ArrayList;

import gui.Screen;
import gui.components.TextArea;
import gui.components.Visible;

public class MyScreen extends Screen {
	
	private TextArea text;

	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		text = new TextArea(20, 200, 500, 100, "Duuuuuuuuuuuuuuuuuuuuuuun Dun dun dun dun "
				+ "dun dun dun dun dun dun dun dundun dun dundundun "
				+ "dun dun dun dun dun dun dundun dundunBOOM ");
		viewObjects.add(text);
	}

}
