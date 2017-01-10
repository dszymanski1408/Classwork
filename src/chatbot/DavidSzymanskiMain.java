package chatbot;

import java.util.Scanner;


public class DavidSzymanskiMain {


		static Scanner input;
		static String user;
		static boolean inLoop;
		static String response; 
		static Topic school;
		static Topic like;
		static Topic hello;

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
				if((findKeyword(response, "good", 0)) >= 0){
					if(findNegation() >= 0){
						print("Aww man that sucks"); 
					}
				
					else{
						print("I'm so happy you're good!");
					}			
				}
				else if(like.isTriggered(response)){
					like.talk();
				}
				else if(hello.isTriggered(response)){
					hello.talk();
				}
				else if(school.isTriggered(response)){
					school.talk();
				}
			}
		}
		
		private static int findNegation(){
			if((findKeyword(response, "not", 0)) >= 0){
				return 0;
			}
			else if((findKeyword(response, "no", 0)) >= 0){
				return 1;
			}
				
			else if((findKeyword(response, "never", 0)) >= 0){
				return 2;
			}
			else if((findKeyword(response, "don't", 0)) >= 0) {
				return 3;
			}
			else return -1;
		}
		
		public static int findKeyword(String searchString, String key, int startIndex){
			//delete white space
			String phrase = searchString.trim();
			//set all letters to lowerCase
			phrase = phrase.toLowerCase();
			key = key.toLowerCase();
			int psn = phrase.indexOf(key);
			//keep looking for the word until you find the right context
			while(psn >= 0){
				String before = " ";
				String after = " ";
				//if the phase does not end with this word
				if(psn + key.length() < phrase.length()){
					after = phrase.substring(psn + key.length(), psn + key.length()+1).toLowerCase();
				}
				
				if(psn > 0){
					before = phrase.substring(psn - 1, psn).toLowerCase();
				}
				 
				if(before.compareTo("a") < 0 && after.compareTo("a") < 0){  
					return psn; 
				}
				
				psn = phrase.indexOf(key,psn+1);
			}
			
			return -1;
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
			like = new Like();
			hello = new DavidHello();
		}
}
