package arrays;

public class arraysMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
//		
//		String[] someStrings = new String[100];
//		populateArray(someStrings);
//		System.out.println("Before \"changeString\" method " + someStrings[99]);
//		changeString(someStrings[99]);
//		System.out.println("After \"changeString\" method " + someStrings[99]);
//		changeArray(someStrings);
//		System.out.println("After \"changeArray\" method " + someStrings[99]);
//		changeArrayElement(someStrings, 99);
//		System.out.println("After \"changeArrayElement\" method " + someStrings[99]);
//		printArray(someStrings);
//		//arrayIntroMethod();
		
		SampleElement sample = new SampleElement(10);
		sample.increase();
		System.out.println("The sample elemnt has" + " a number equal to " + sample.getNumber());
		
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime - startTime) + " milliseconds");
	}
	
//	private static void changeArrayElement(String[] someStrings, int i) {
//		someStrings[i] = "new item " + (i+1);
//		
//	}
//
//	private static void changeArray(String[] someStrings) {
//		someStrings = new String[100];
//		for(int i = 0; i < someStrings.length; i ++){
//			someStrings[i] = "new item "+ (i+1);
//		}
//		
//	}
//
//	private static void changeString(String someStrings){
//		someStrings = "This string has been changed!";
//	}
//	
//	private static void printArray(String[] a) {
//		// TODO Auto-generated method stub
//		for(String s: a){
//			System.out.println(s);
//		}
//	}
//
//
//
//	private static void populateArray(String[] a) {
//		// TODO Auto-generated method stub
//		for(int index = 0; index < a.length; index++){
//			a[index] = "value " + (index+1);
//		}
//	}



	public static void arrayIntroMethod(){
		// construct 3 integer arrays
		//int[] zeros1 = {0,0,0};
		//these two methods do the same thing
		//int[] zeros2 = new int[3];
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
		String[] strings2 = new String[10];
		
		for(String s: strings1){
			System.out.println(s);
		}
		for(String s: strings2){
			System.out.println(s);
		}
		
		for(int index = 0; index < strings2.length; index++){
			strings2[index] = "value " + (index+1);
		}
		
		for(String s: strings2){
			System.out.println(s);
		}
		
	}
}
