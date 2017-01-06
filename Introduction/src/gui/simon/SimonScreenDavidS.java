package gui.simon;

import java.util.ArrayList;

import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;

public class SimonScreenDavidS extends ClickableScreen implements Runnable {
	
	private TextLabel text;
	private ButtonInterfaceDavidS[] button;
	private ProgressInterfaceDavidS progress;
	private ArrayList<MoveInterfaceDavidS> moves;
	
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	
	public SimonScreenDavidS(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
	}

}
