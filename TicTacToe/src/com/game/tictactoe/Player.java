package com.game.tictactoe;

import java.util.Scanner;

public class Player {
	public static char[][] TABLE = new char[3][3];
	public static String[] ARGS = new String[2]; // array to store the position
													// in the 2 dimensional
	public static void main(String[] args) {												// array
	String CHOICE = "";
	
		
		System.out.println("Enter coordinates: ");
		
		Scanner sc = new Scanner(System.in);
		String coords = sc.nextLine();
		
		ARGS = coords.split(" ");
		int C = Integer.parseInt(ARGS[0]) - 1;
		int R = Integer.parseInt(ARGS[1]) - 1;

		TABLE[R][C] = CHOICE.charAt(0);
		createTable(TABLE);
		sc.close();
	}
	

	public static void createTable(char[][] TABLE) {

		for (int j = 0; j < TABLE.length; j++) {
			for (int k = 0; k < TABLE[0].length; k++) {
				System.out.print("[" + TABLE[j][k] + "]");
			}
			System.out.println();
		}
		
	}

}