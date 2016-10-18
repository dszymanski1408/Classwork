package arrays;

public class arraysMain {
	
	static int[] results = new int[11];
 
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
		printResultsArray(results);
		
		String[] someCardDeck = new String[52];
		populateCardArray(someCardDeck);
		printStringArray(someCardDeck);
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
	
	private static void printResultsArray(int[] results2) {
		for(int i = 0; i < results2.length; i++){
			System.out.println((i+2) );
		}
		
	}

	private static void populateCardArray(String[] cards) {
		String[] typeOfCards = {"Hearts", "Clubs", "Spades", "Diamonds"};
		String[] cardValue = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
					"Jack", "Queen", "King", "Ace"};
		int numOfCards = 0;
		for(int i = 0; i < typeOfCards.length; i++){
			for(int j = 0; j < cardValue.length; j++){
				cards[numOfCards] = cardValue[j] + " of " + typeOfCards[i];
				numOfCards++;
			}
		}	
	}

	private static void checkDiceRandomViability(int[] rolls) {
		for(int i = 0; i < rolls.length; i++){
			results[rolls[i]-2]++;
		}
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
	
	public static void printStringArray(String[] anArray) {
		StringBuilder sb = new StringBuilder();
			for (int i = 0; i < anArray.length; i++) {
				if (i > 0) {
					sb.append(", ");
		        }
		        sb.append(anArray[i]);
		      }
			print(sb.toString());
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
