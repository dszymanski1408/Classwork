package dataTypes;

import java.util.Scanner;

public class StringPractice {
	
	static Scanner input;
	static String user;
	static boolean inLoop;
	static String response; 

	public static void main(String[] args) {
		createAScanner();
		demonstrateStringMethod(); 
		promptName(); 
		talkForever(); 
	}
	
	private static void promptName() {
		print("Hello, human I am a board covered with "
				+ "semiconducters and other  such electronic components"
				+ ", what is your name?");
		user = input.nextLine();
		print("Awesome! I will call you " + user + " until you terminate me.");
	}

	public static void talkForever(){
		inLoop = true;
		while(inLoop){
			print("Greetings " + user + " how are you?");
			response = getInput();
			if(response.indexOf("good") > 0){
				print("I'm so happy you're good!");
			}
			else{
				print("I'm sorry I don't understand you.");
			}
			
		}
	}

	private static void promptInput() {
		print(user + " Try inputing a String!");
		String userInput = input.nextLine();
		print("You typed: " + userInput);
	}
	
	public static String getInput(){
		return input.nextLine();
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
