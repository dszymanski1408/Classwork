package gui.wackamole;

import java.util.ArrayList;

import gui.components.Action;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;

public class WackAMoleScreen extends ClickableScreen implements Runnable {

	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	
	public WackAMoleScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
		timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(370,270,100,50, "Sample");
		timeLabel = new TextLabel(300, 30,100,50,"30.0");
		viewObjects.add(player);
		viewObjects.add(timeLabel);
		viewObjects.add(label);
	}

	public PlayerInterface getAPlayer(){
		return new Player();
	}
	
	public MoleInterface getAMole(){
		return new Mole((int)(Math.random()* getWidth()), (int)(Math.random()*getHeight()));
	}
	
	public void run(){
		changeText("Ready...");
		changeText("Set...");
		changeText("Kerchow!");
		label.setText("");
		while(timeLeft > 0){
			updateTimer();
			updateAllMoles();
			appearNewMole();
		}
	}

	private void appearNewMole() {
		// TODO Auto-generated method stub
		double chance = .1 * (60 - timeLeft)/60;
		if(Math.random() < chance){
			final MoleInterface mole = getAMole();
			mole.setAppearanceTime((int) (500+Math.random() * 2000));
			mole.setAction(new Action(){
				public void act(){
					player.increaseScore(1);
					remove(mole);
					moles.remove(mole);
				}
			});
			addObject(mole);
			moles.add(mole);
		}
	}

	private void updateAllMoles() {
		// TODO Auto-generated method stub
		for(int i = moles.size()-1; i > -1; i--){
			MoleInterface m = moles.get(i);
			int screenTime = m.getAppearanceTime();
			m.setAppearanceTime(screenTime - 100);
			if(m.getAppearanceTime() <= 0){
				remove(m);
				moles.remove(m);
			}
		}
	}

	private void updateTimer() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timeLeft -= .1;
		timeLabel.setText("" + (int)(timeLeft*10)/10.0);
	}

	private void changeText(String string) {
		// TODO Auto-generated method stub
		label.setText(string);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
