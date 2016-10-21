package arrays;

public class CodeboardFirstTrials {

	public static void main(String[] args) {
		int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] numberArray2 = {1, 2, 3, 4, 5, 6, 8, 9, 11, 10};
		System.out.println(isSorted(numberArray));
		System.out.println(countDifferences(numberArray, numberArray2));
		
		System.out.println(checkHalfway(numberArray, 9, 0, numberArray.length));
		
		reverseOrder(numberArray);
		
		swap(numberArray, 0, numberArray.length -1);
		
		shuffle(numberArray);
		
		
	}
	
    private static void shuffle(int[] numberArray) {
		for(int i = 0; i < numberArray.length; i++){
			int random = (int) (Math.random() * 6);
			swap(numberArray, i, random);	
		}
		printArray(numberArray);
	}

	private static void swap(int[] numberArray, int i, int j) {
		int placeholder = numberArray[j];
		numberArray[j] = numberArray[i];
		numberArray[i] = placeholder;
		
	}

	private static boolean checkHalfway(int[] numberArray, int query, int start, int end) {
		return query < numberArray[(start+end+1)/2];
	}

	public static boolean isSorted(int[] array){ 
         for(int i = 1; i < array.length; i++){
             if(array[i] <= array[i - 1]){
            	 return false;
             }
         } 
         return true;
    }
    
    public static int countDifferences(int[] array1, int[] array2){
    		
     return 0;
    }
    
    public static void reverseOrder(int[] array){
    	for(int i = 0; i < (int) (array.length/2); i++){
    		int toSwitch = array[i];
    		int beingSwitched = array[array.length-i-1];
    		array[i] = beingSwitched;
    		array[(array.length - 1) - i] = toSwitch;
    	}
    	printArray(array);
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
