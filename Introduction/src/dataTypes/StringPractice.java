package dataTypes;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String text = new String("Hello World"); the new String is unneeded.
		String text1 = "Hello World";
		String text2 = "Hello ";
		String text3 = "World";
		
		if(text1.equals(text2 + text3)){
			System.out.println("These strings are equal.");
		}
		System.out.println(text1);
		System.out.println(text2 + text3);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		if(word1.compareTo(word2) < 0){
			System.out.println("Word1 is before Word2," + " lexicongraphically.");
		}
	}

}
