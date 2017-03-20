package com.main.chkdgt;

import java.util.Scanner;

public class ISBNCheckDigit {
	public static String[] ISBN;
	
	public static void main(String[] args) {
		System.out.println("Enter ISBN:");
		Scanner sc = new Scanner(System.in);
		
		int SUM = 0;
		ISBN = sc.nextLine().split("");
		for(int i = 0; i<ISBN.length-1; i++){
			SUM = SUM + (Integer.parseInt(ISBN[i]) * (ISBN.length-i));
		}
		if (11-(SUM % 11) == Integer.parseInt(ISBN[ISBN.length-1])){
			System.out.println("THIS IS A TRUE CODE");
		}

		sc.close();
	}
}
