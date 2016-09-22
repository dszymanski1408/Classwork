package dataTypes;

import java.util.Scanner;

public class StringPractice {
	
	static Scanner input;
	static String user;
	static int lineCount;

	public static void main(String[] args) {
		createAScanner();
		lineCount = 0; 
		demonstrateStringMethod(); 
		promptName(); 
		talkForever(); 
	}
	
	private static void promptName() {
		print("Hello, human I am a board \n covered with "
				+ "semiconducters \n and other  such electronic \n components"
				+ ", what is your \n name?");
		user = input.nextLine();
		print("Awesome! I will call you " + user + " until you terminete me.");
	}

	public static void talkForever(){
		while(true){
			promptInput();
		}
	}

	private static void promptInput() {
		print(user + " Try inputing a String!");
		String userInput = input.nextLine();
		print("You typed: " + userInput);
	}
	
	public static void print(String s){
		lineCount++;
		System.out.println("Line #" + lineCount + ": " + s);
	}

	private static void createAScanner() {
		input = new Scanner(System.in); 
		
	}
	
	public static void demonstrateStringMethod(){
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
