package testOrQuizWork;

import java.util.Scanner;

public class LogInQuiz {
	
	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry(){
		return input.nextLine();
	}
	
	private static String username = "test_user";
	private static String password = "test";
	
	public static void main(String[] args) {
		if(correctUser()){
			askPassword();
		}
		else 
			System.out.println("Unknown username");	
	}

	private static void askPassword() {
		boolean inLoop = true;
		int remainingTries = 3;
		while(inLoop){
			System.out.println("Enter your password.");
			String entry = waitForEntry();
			if(entry.equals(password)){
				System.out.println("You are in!");
				inLoop = false;
			}
			else{
				remainingTries--;
		
				if(remainingTries == 0){
					System.out.println("invalid password.");
					inLoop = false;
				}
				else{
					System.out.println("Incorrect Password "
						+ "you have " + remainingTries + "tries left");
				}
			}
		}
		
	}

	private static boolean correctUser() {
		System.out.println("Enter username");
		return waitForEntry().equals(username);
	}
	
}
