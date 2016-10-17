package arrays;

public class arraysMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
//		
		int[] someStrings = new int[100];
		populateArrayRandom(someStrings);
		printArray(someStrings);
		
		int[] someDiceRolls = new int[100];
		populateArrayRandomDice(someDiceRolls);
		printArray(someDiceRolls);
		checkDiceRandomViability(someDiceRolls);
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
	
	public static void populateArrayRandomDice(int[] a) {
		for(int index = 0; index < a.length; index++){
			int b = (int) (((Math.random()) * 6) + 1);
			int c = (int) (((Math.random()) * 6) + 1);
			a[index] = b + c;
		}
		
	}

	public static void printArray(int[] anArray) {
		StringBuilder sb = new StringBuilder();
			for (int i = 0; i < anArray.length; i++) {
				if (i > 0) {
					sb.append(", ");
		        }
		        sb.append(anArray[i]);
		      }
			print(sb.toString());
	}
	
	public static void checkDiceRandomViability(int[] a){	
			
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		int x = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		int m = 0;
		
		for(int i = 0; i < a.length; i++){
			if(a[i] == 1){
				b++;
			}
			else if(a[i] == 2){
				c++;
			}
			else if(a[i] == 3){
				d++;
			}
			else if(a[i] == 4){
				e++;
			}
			else if(a[i] == 5){
				f++;
			}
			else if(a[i] == 6){
				g++;
			}
			else if(a[i] == 7){
				h++;
			}
			else if(a[i] == 8){
				x++;
			}
			else if(a[i] == 9){
				j++;
			}
			else if(a[i] == 10){
				k++;
			}
			else if(a[i] == 11){
				l++;
			}
			else if(a[i] == 12){
				m++;
			}
		}
			
		double n = ((double) (b/a.length) * 100);
		double o = ((double) (c/a.length) * 100);
		double p = ((double) (d/a.length) * 100);
		double q = ((double) (e/a.length) * 100);
		double r = ((double) (f/a.length) * 100);
		double s = ((double) (g/a.length) * 100);
		double t = ((double) (h/a.length) * 100);
		double u = ((double) (x/a.length) * 100);
		double v = ((double) (j/a.length) * 100);
		double y = ((double) (k/a.length) * 100);
		double z = ((double) (l/a.length) * 100);
		double ab = (((double) (m/a.length)) * 100);
			
		print(n+"% " + o+"% " + p+"% " + q+"% " + r+"% " + s+"% " 
				+ t+"% " + u+"% " + v+"% " + y+"% " + z+"%" + ab+"%");
		
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
	public static void populateArrayRandom(int[] a) {
		// TODO Auto-generated method stub
		for(int index = 0; index < a.length; index++){
			a[index] = (int) ((Math.random()) * 50);
		}
	}



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
	
	public static void print(String s){
		//create a multi-line print String
		String  printString = "";
		int cutoff = 35;
		//check to see if there are words to add
		//in other words is the length of s is greater then 0
		while(s.length() > 0){
			String currentLine = "";
			String nextWord = "";
			//while the currentLine and the nextWord are
			//less then the cutoff, AND there are still words
			//to add do the following loop
			while(currentLine.length() + nextWord.length() <= cutoff && s.length() > 0){
				//add the next word to the line
				currentLine += nextWord;
				//remove tha1t word
				s = s.substring(nextWord.length());
				//get the following word
				int endOfWord = s.indexOf(" ");
				//check to see if this is the last word
				if(endOfWord == -1){
					endOfWord = s.length() - 1;
				}
				//get the next word and space
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += currentLine + "\n";
		}
		System.out.println(printString);
	}
}
