package dataTypes;

import java.util.Random;

public class MathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] results = new int[6];
		//same as
		//int[] results = {0,0,0,0,0,0}
		
		int totalRolls = 1000;
		for(int index = 0; index < totalRolls; index++){
			int roll = rollUnfairDie();
			System.out.println("Roll #" + (index+1) + " Die is " + roll);
			results[roll-1]++;
		}
		for(int i = 0; i < 6; i++){
			double percentage = (double) ((((double)results[i]/totalRolls)*100000)/1000.0); 
			System.out.println((i+1) + " was rolled " + percentage + "% of the time.");
		}
	}
	
	public static int rollFairDie(){
//		Random gen = new Random();
//		return gen.nextInt(6)+1;
		double rand = Math.random();//random double (0,1)
		int roll = (int) (6 * rand);//values = 0 to 5 (inclusive) (This is what the above code does)
		return roll + 1;//0 becomes 1, 5 becomes 6
	}

	public static int rollUnfairDie(){
		int num[] = {1,6,2,3,6,4,5,6,6,5,4,6};
		double rollUnfair = Math.random();
		return num[(int) (rollUnfair * num.length)];	
	}

}
