package introUnit;

public class Senior extends Student {
	
	private String internship;
	private String food;

	public Senior(String name, String internship, String food) {
		super(name);
		this.internship = internship;
		this.food = food;
	}

	public void talk(){
		super.talk();//call the super method
		System.out.println("and I am a senior! I am interning as a " + internship + " and my favorite food is " + food);
	}
}
