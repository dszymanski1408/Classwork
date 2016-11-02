package caveExplorer;

public class Practice {
	public static void main(String[] args) {
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
