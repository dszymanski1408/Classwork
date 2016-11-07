package caveExplorer;

//import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayIntro {
	
	public static String[][] arr2D;
	public static String[][] pic;
	public static int i;
	public static int j;
	public static Scanner in;

	public static void main(String[] args) {
		arr2D = new String[5][4];
		pic = new String[5][4];
		//iterate row by row:
		for(int row = 0; row < arr2D.length; row++){
			//in each row go column by column
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] = "(" + row + "," + col+")";
			}
		}
		i = 2;
		j = 3;
		in = new Scanner(System.in);
		
		startExploring();
	}

	private static void startExploring() {
		while(true){
			System.out.println("You are in room " + arr2D[i][j]);
			System.out.println("What do they what to do?");
			String input = in.nextLine();
			while(!isValid(input)){
				System.out.println("Please enter w, a, s, or d.");
				input = in.nextLine();
			}
			interpretInput(input.toLowerCase());
		}
	}

	private static void interpretInput(String input) {
		int iOrig = i;
		int jOrig = j;
		if(input.equals("w") && i > 0) i--;
		else if(input.equals("a") && j > 0) j--;
		else if(input.equals("s") && i+1 < arr2D.length) i++;
		else if(input.equals("d") && j+1 < arr2D[0].length) j++;
		if(iOrig == i && iOrig == j){
			System.out.println("WHOA THERE BUDDY");
		}
	}

	private static boolean isValid(String input) {
		String lc = input.toLowerCase();
		String[] keys = {"w" , "a", "s", "d"};
		for(String key: keys){
			if(key.equals(lc))return true;
		}
		return false;
	}
}
