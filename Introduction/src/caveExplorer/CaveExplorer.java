package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {
	
	public static CaveRoom caves[][];
	public static Scanner in;
	public static CaveRoom currentRoom;
	public static Inventory inventory;
	
	public static void main(String[] args){
		in = new Scanner(System.in);
		
		caves = new CaveRoom[5][5];
		for(int row = 0; row < caves.length; row++){
			for(int col = 0; col < caves[row].length; col++){
				caves[row][col] = new CaveRoom("This cave has the coordinates " +
						"(" + row + "," + col + ")");
						
			}
		}
		caves[0][2] = new EventRoom("This is the room where that guy with a tail met you", new GameStartEvent());
		currentRoom = caves[0][1];
		currentRoom.enter();
		caves[0][1].setConnection(CaveRoom.EAST, caves[0][2], new Door());
		caves[0][2].setConnection(CaveRoom.SOUTH, caves[1][2], new Door());
		caves[1][2].setConnection(CaveRoom.SOUTH, caves[2][2], new Door());
		startExploring();
	}
//you could at least close this. 
	private static void startExploring() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println(Inventory.getDescription());
			System.out.println(currentRoom.getDescription());
			System.out.println("What would you like to do?");
			String input = in.nextLine();
			currentRoom.interpretInput(input);
		}
	}

	public static void print(String s) {
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
