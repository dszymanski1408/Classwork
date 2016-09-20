package dataTypes;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1) " + (5.0/2));
		System.out.println("2) " + ((double) 5/2));
		System.out.println("3) " + (5/2));
		System.out.println("5) " + (3+5.0/2+5*2));
		System.out.println("6) " + (3.0+5/2+5*2));
		System.out.println("8) " + ((int)(3.0 + 5)/(2 + 5 * 2)));
		
		if(42 == 42.0) System.out.println("10) " + "42 equals 42.0");
		
		String ten = "10";
		String two = "2";
		
		if(ten.compareTo(two)>0) System.out.println("11) " + "10 is greater then 2");
		else System.out.println("11) " + "10 is not greater then 2");
		
		double d1 = 4.64; 
		double d2 = 2.0;
		double d3 = 2.64;

		System.out.println("d1) " + "d1 is equal to " + d1); 
		System.out.println("d2) " + "d2 is equal to " + d2); 
		System.out.println("d3) " + "d3 is equal to " + d3);  
		System.out.println("d4) " + "d1 - d2 is equal to " + (d1 - d2));
		//the reason for this error is caused by the way the computer
		//converts to binary and then performs the operation
		

		


	}

}
