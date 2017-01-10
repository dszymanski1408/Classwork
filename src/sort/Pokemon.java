package sort;

public class Pokemon {
	private int hp;
	private int lvl;
	private String name;
	private boolean poisoned;
	
	public Pokemon(String string, int i) {	
		name = string;
		lvl = i;
		hp = 100;
		poisoned = false;
	}
	
	public void attack(Pokemon target, Attack attack){
		if(Math.random() < .9){
			attack.attack(target);
			System.out.println("The attack hit");
		}else{
			System.out.println("The attack missed" );
		}
	}
	
	public void iChooseYou() {
		System.out.println(name + "," + name + "!");
	}
	
	public int getHP() {
		return hp;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHP(int hp) {
		 this.hp = hp;
	}
	
	public void setPoisoned(boolean poisoned) {
		this.poisoned = poisoned;
	}
	
	public void lapse() {
		if(poisoned){
			hp -= 15;
		}
	}
}
