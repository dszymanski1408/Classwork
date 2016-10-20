package arrays;

public class CodeboardFirstTrials {

	public static void main(String[] args) {
		int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		isSorted(numberArray);
		System.out.print(isSorted(numberArray));
		
		reverseOrder(numberArray);
	}
	
    public static boolean isSorted(int[] array){ 
         for(int i = 1; i < array.length; i++){
             if(array[i] < array[i - 1]){
            	 return false;
             }
         } 
         return true;
    }
    
    public static void reverseOrder(int[] array){
    	int[] newArray = new int[array.length];
    	for(int i = 0; i < array.length; i++){
    		newArray[(array.length - 1) - i] = array[i];
    	}
    	printArray(newArray);
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
