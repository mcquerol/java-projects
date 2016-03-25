package CS05WorkingwithAnArrayOfTemperatures;

import java.util.Scanner;

public class multiplication {

	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("First number?");
		double num1 = in.nextDouble();
		System.out.println("second number?");
		double num2 = in.nextDouble();
		
		double X;
		X=1;
		for (int i = 1; i<=num2; i++){
			X+=num2;
			
		}
		System.out.println("Result = " + X);
		
		
	}
	
}
