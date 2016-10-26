package arrays;

public class CodeboardFirstTrials {

	public static void main(String[] args) {
		int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] numberArray2 = {1, 2, 3, 4, 5, 6, 8, 9, 11, 10};
		int [] numberArray3 = {1, 2, 3, 7, 1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println(isSorted(numberArray));
		
		System.out.println(longestSharedSequence(numberArray, numberArray3));
		
		System.out.println(binarySearch(numberArray, 2));
		
		System.out.println(countDifferences(numberArray, numberArray2));
		
		System.out.println(longestConsecutiveSequence(numberArray3));
		
		System.out.println(checkHalfway(numberArray, 9, 0, numberArray.length));
		
		reverseOrder(numberArray);
		
		swap(numberArray, 0, numberArray.length -1);
		
		reverseOrder(numberArray);
		
		cycleTheIntArray(numberArray, 4);
		
		printArray(generateDistinctItemsList(100));
		
		
		
		printArray(getSubArray(numberArray, 2, 8));
		
		System.out.println(contains(numberArray, getSubArray(numberArray, 2, 8)));
	}
		public static double[] getStats(double[] array){
	     double[] stats = new double[6];
	         stats[0] = findMean(array);
	         stats[1] = findMax(array);
	         stats[2] = findMin(array);
	         stats[3] = findMed(array);
	         stats[4] = findGreaterMean(array, findMean(array));
	         stats[5] = findLessMean(array, findMean(array));
	     return stats;
	}
	private static double findLessMean(double[] array, double mean) {
	    	double lessMean = 0.00;
	    	for(int i =0; i <array.length; i++)
	    	{
	    		if(array[i] < mean )
	    		{
	    			lessMean++;
	    		}
	    	}
			return lessMean;
		}
		private static double findGreaterMean(double[] array, double mean) {
			double greaterMean = 0.00;
	    	for(int i =0; i <array.length; i++)
	    	{
	    		if(array[i] > mean || array[i] == mean)
	    		{
	    			greaterMean++;
	    		}
	    	}
			return greaterMean;
		}
		private static double findMed(double[] array) {
			double median = 0.00;
			sortArray(array);
			if(array.length % 2 == 0)
			{
				median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
			}
			else
			{	
				median = (double) array[array.length/2];
			}
			return median;
		}
		private static void sortArray(double[] array) {
			for (int i = 0; i<array.length;i++)
			{
				for(int j = i+1; j<array.length; j++)
				{
					double temp = array[i];
					double temp2 = array[j];
					
					if(temp > temp2)
					{
						array[i] = temp2;
						array[j] = temp;
					}
				}
			}
		}
		private static double findMin(double[] array) {
	    	sortArray(array);
			return array[0];
		}
		private static double findMax(double[] array) {
	    	sortArray(array);
			return array[array.length-1];
		}
		private static double findMean(double[] array) {
	    	double mean = 0.00;
			for(int i = 0; i<array.length; i++)
			{
				mean = mean + array[i];
			}
			return mean/array.length;
		}
	
    public static int longestSharedSequence(int[] arr, int[] arr2){
   	int start = 0;
     	int max = 0;
     	for(int i = 0; i < arr.length; i++){
     		for(int j = 0; j < arr2.length; j++){
             	int x = 0;
            	while(arr[i + x] == arr2[j + x]){
                 	x++;
                 	if(((i + x) >= arr.length) || ((j + x) >= arr2.length)) break;
             	}
             	if(x > max){
                 	max = x;
                 	start = i;
            	}
          	}
     	}
     	int endIndex = (start + max - 1);
     	int startIndex = start;
		int[] array1 = new int[endIndex - startIndex + 1];
		for(int i = 0; i < array1.length; i++){
			array1[i] = arr[startIndex + i];
		}
		return array1.length;
    	}
	public static int countUnderBound(double[] arr, double d){
		int indexOfNumber = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < d){
				indexOfNumber++;
			}
		}
		return indexOfNumber;
	}
    
	private static int longestConsecutiveSequence(int[] nA) {
		int countSequence = 1;
		int longestSequence = 1;
		for(int i = 0; i < nA.length-1; i++){
			if(nA[i] == nA[i+1]-1){
				countSequence++;
				if(longestSequence < countSequence){
					longestSequence = countSequence;
				}
			}
			else countSequence = 1;
		}
		return longestSequence;
	}

	public static int[] getSubArray(int[] arr, int startIndex, int endIndex){
		int[] array1 = new int[endIndex - startIndex + 1];
		for(int i = 0; i < array1.length; i++){
			array1[i] = arr[startIndex + i];
		}
		return array1;
	}
	
	public static boolean contains(int[] arr, int[] subArr){
		for(int i =0; i < arr.length; i++){
			if(arr[i] == subArr[0]){
				int j = 0;
				while(j < subArr.length){
					if(subArr[j] == arr[i + j] && j == subArr.length-1){
						return true;		
					}
					else if(subArr[j] != arr[i+j]){
						break;
					}
					j++;
				}
			}
		}
		return false;
	}	
	
	private static int binarySearch(int[] numberArray, int key) {
		int low = 0;
		int high = numberArray.length - 1;
			          
		while(high >= low) {
			int middle = (low + high) / 2; 
			if(numberArray[middle] == key) {
				return middle;
			}
			if(numberArray[middle] < key) {
				low = middle + 1;
			}
			if(numberArray[middle] > key) {
				high = middle - 1;
			}
		}
		
		return -1;		
	}

	private static void cycleTheIntArray(int[] numberArray, int i) {
		for(int s = 0; s < i; s++){
			for(int j = 0; j < numberArray.length-1; j++){
				int placeHolder = numberArray[j];
				int placeHolderTwo = numberArray[j+1];
				numberArray[j] = placeHolderTwo;
				numberArray[j + 1] = placeHolder;
			}
		}
		printArray(numberArray);
	}

	public static int[] generateDistinctItemsList(int n){
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
		    a[i] = (int)(Math.random()* (2 * n) + 1);

		    for (int j = 0; j < i; j++) {
		        if (a[i] == a[j]) {
		            i--; 
		            break;
		        }
		    }  
		}
		return a;
	}
	
//    private static void shuffle(int[] numberArray) {
//		for(int i = 0; i < numberArray.length-1; i++){
//			swap(numberArray, i, i + 1);	
//		}
//		printArray(numberArray);
//	}

	private static void swap(int[] numberArray, int i, int j) {
		int placeholder = numberArray[j];
		numberArray[j] = numberArray[i];
		numberArray[i] = placeholder;
		
	}

	private static boolean checkHalfway(int[] numberArray, int query, int start, int end) {
		return query < numberArray[(start+end+1)/2];
	}

	public static boolean isSorted(int[] array){ 
         for(int i = 0; i < array.length-1; i++){
             if(!(array[i] <= array[i + 1])){
            	 return false;
             }
         } 
         return true;
    }
    
    public static int countDifferences(int[] array1, int[] array2){
    	int incorrectCount = 0;
    	for(int i = 0; i < array1.length; i++){
    		if(array1[i] != array2[i]){
    			incorrectCount++;
    		}
    	}
     return incorrectCount;
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
