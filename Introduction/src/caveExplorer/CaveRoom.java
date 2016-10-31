package caveExplorer;

public class CaveRoom {
	
	//"final" never changes
	public static final int NORTH = 0;
	public static final int	EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;
	
	private String description;
	private String contents;
	private String defaultContents;
	
	private CaveRoom[] borderingRooms;
	private Door[] doors;

	public CaveRoom(String description){
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

	}

}
