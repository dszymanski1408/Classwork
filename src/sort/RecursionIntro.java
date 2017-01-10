package sort;

public class RecursionIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using a loop...");
		for(int i = 0; i < 5; i++){
			System.out.println("Hello World!");
		}
		System.out.println("Using recursion...");
		int numberOfTimes = 5;
		forLoop(numberOfTimes, new Action() {
			public void act() {
				System.out.println("Hello Everyone!");
			}
		});
		
		hanoi(3, "A", "B", "C");
	}
	
	public static void hanoi(int numberOfDisks, String from, String mid, String to){
		if(numberOfDisks < 2){
			print("Move from " + from + " to " + to);
		}
		else{
			hanoi(numberOfDisks-1, from,to,mid);
			hanoi(1,from,mid,to);
			hanoi(numberOfDisks-1,mid,from,to);
		}
	}
	
	private static int moveCount = 1;
	
	private static void print(String string) {
		// TODO Auto-generated method stub
		System.out.println("Move #" + moveCount + " " + string);
		moveCount++;
	}

	private static void forLoop(int numberOfTimes, Action action) {
		// TODO Auto-generated method stub
		if(numberOfTimes < 2){
			action.act();
		}
		else{
			action.act();
			forLoop(numberOfTimes-1,action);
		}
	}

}
