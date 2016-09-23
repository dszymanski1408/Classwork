package chatbot;

import java.util.Scanner;


public class DavidSzymanskiMain {


		static Scanner input;
		static String user;
		static boolean inLoop;
		static String response; 
		static Topic school;
		

		public static void main(String[] args) {
			createTopics(); 
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
				else if(response.indexOf("school") > 0){
					inLoop = false; //exists this loop
					school.talk(); 
				}
				else{
					print("I'm sorry I don't understand you.");
				}
				
			}
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

		public static void createTopics () {
			input = new Scanner(System.in); 
			school = new School();
		}
}
