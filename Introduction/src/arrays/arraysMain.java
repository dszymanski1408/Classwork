package arrays;

public class arraysMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		arrayIntroMethod();
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime - startTime) + " milliseconds");
	}
	
	
	
	public static void arrayIntroMethod(){
		// construct 3 integer arrays
		int[] zeros1 = {0,0,0};
		//these two methods do the same thing
		int[] zeros2 = new int[3];
		//example
		boolean[] booleans = new boolean[3];
		//iterate (2 ways)
		//WHEN TO USE THIS METHOD: FOR LOOP
		// - when the index of the data is important to reference
		// - you need to customize how you iterate
				//(increase by 2, backwards, etc...)
		for(int index = 0; index < booleans.length; index++){
			System.out.println(index + ")" + booleans[index]);
		}
		
		//SECOND METHOD: FOR EACH 
		//always goes in order, does not keep track of index
		//easier to type
		for(boolean b: booleans){
			System.out.println("" + b);
		}
		
		String[] strings1 = {"", "", ""};
		//these two constructors are different
		String[] strings2 = new String[3];
		
		for(String s: strings1){
			System.out.println(s);
		}
		for(String s: strings2){
			System.out.println(s);
		}
	}

}
