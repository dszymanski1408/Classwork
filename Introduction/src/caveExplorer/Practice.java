package caveExplorer;

public class Practice {
	public static void main(String[] args) {
		boolean[][] minecraft = new boolean[6][6];
		mineCrafter(minecraft, 10);
		String[][] field = new String[minecraft.length][minecraft[0].length];
		matchValues(field, minecraft);
		
		String[][] grid = new String[13][16];
		createGrid(grid);
		print2DArr(grid);
	}
	
	private static void createGrid(String[][] grid) {
		for(int r = 0; r < grid.length; r++){
			for(int c = 0; c < grid[r].length; c++){
					grid[r][c] = " ";
			}
		}
		

		for(int a = 0; a < grid[0].length; a++){
			grid[0][a] = "_";
		}
		for(int row = 1; row < grid.length; row++){
			for(int col = 0; col < grid[row].length; col += 3){
				grid[row][col] = "|";
			}
		}
		for(int r = 0; r < grid.length; r += 3){
			for(int c = 0; c < grid[r].length; c++){
				if(grid[r][c] == " "){
					grid[r][c] = "_";
				}
			}
		}
		
		grid[0][0] = " ";
		grid[0][grid[0].length -1] = " ";
	}

	private static void matchValues(String[][] field, boolean[][] minecraft) {
		for(int row = 0; row < field.length; row++){
			for(int col = 0; col < field[0].length; col++){
				if(minecraft[row][col])field[row][col] = "X";
				else{
					field[row][col] = countAdjacent(minecraft, row, col);
				}
			}
		}
	}

	private static String countAdjacent(boolean[][] minecraft, int r, int c) {
		int count = 0;
//		for(int row = r - 1; row <= r + 1; row++){
//			for(int col = c - 1; col <= c + 1; col++){
//				if(row != r && col != c){
//					if(row >= 0 && row < minecraft.length && col >= 0 && col < minecraft[0].length){
//						if(minecraft[row][col]){
//							count++;
//						}
//					}
//				}
//			}
//		}
		
		//this method only checks elements in the [][]
		//so it is nessesary to verify they are valid
//		for(int row = 0; row < minecraft.length; row++){
//			for(int col = 0; col < minecraft[row].length; col++){
//				if(Math.abs(row - r) + Math.abs(col - c) == 1 && minecraft[row][col]){
//					count++;
//				}
//			}
//		}
		return count + "";
	}

	private static void mineCrafter(boolean[][] minecraft, int numberOfMines) {
			while(numberOfMines > 0){
			int row = (int)(Math.random() * minecraft.length);
			int col = (int)(Math.random() * minecraft[0].length);
			if(!minecraft[row][col]){
				minecraft[row][col] = true;
				numberOfMines--;
			}
		}	
	}

	public static void printFramedPic(){
		String[][] arr = new String[11][13];
		for(int row = 0; row < arr.length; row++){
			for(int col = 0; col < arr[row].length; col++){
				arr[row][col] = " ";
			}
		}
		arr[2][2] = "O";
		arr[1][2] = "|";
		arr[3][2] = "|";
		arr[2][1] = "-";
		arr[2][3] = "-";
		arr[1][1] = "\\";
		arr[3][3] = "\\";
		arr[1][3] = "/";
		arr[3][1] = "/";
		
		
		
		//int randomPlaceCol = (int) ((Math.random() * 6) + 4);
		//int randomPlaceRow = (int) ((Math.random() * 6) + 4)
		
		
		
		for(int row = 7; row < arr.length; row++){
			for(int col = 0; col < arr[row].length; col++){
				arr[row][col] = "/";
				arr[row - 1][col] = "o";
			}
		}
		
		for(int col = 0; col < arr[0].length; col++){
			arr[0][col] = "_";
			arr[arr.length-1][col] = "_";
		}
		
		for(int row = 1; row < arr.length; row++){
			arr[row][0] = "|";
			arr[row][arr[0].length-1] = "|";
		}
		
		print2DArr(arr);
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
