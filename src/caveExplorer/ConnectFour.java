package caveExplorer;

import java.util.Scanner;

public class ConnectFour {
	
	public static String[][] grid = new String[8][8];
	public static Scanner in;
	public static boolean inLoop;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		for(int row = 0; row < grid.length; row++){
			for(int col = 0; col < grid[row].length; col++){
				grid[row][col] = " ";
			}
		}
		
		for(int col = 0; col < grid[0].length; col++){
			grid[0][col] = "" + col + "";
		}
		print2DArr(grid);
		inLoop = true;
		while(inLoop){
			System.out.println("What column do you want to drop your piece?");
			String input = in.nextLine();
			if(isValid(input)){
				int colNum = Integer.parseInt(input);
				for(int row = grid.length - 1; row >= 0; row--){
					if(!grid[row][colNum].equals("O")){
							grid[row][colNum] = "O";
							print2DArr(grid);
							break;
					}
				}

			}
		}
	}
	
	
	private static boolean isValid(String input) {
		String[] arr = {"0", "1", "2", "3", "4", "5", "6", "7"};
		for(String a: arr){
			if(a.equals(input)){
				return true;
			}
		}
		return false;
	}


	public static void print2DArr(String[][] pic){
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				System.out.print(pic[row][col]);
			}
			System.out.println();
		}
	}
}
