package Main;

import java.util.Scanner;
import Main.Deck;
	
public class Game {
	
	public static void main(String[] args){
			
			Deck d = new Deck(); // create instance of object class
			d.MakeDeck(); // make the deck
			
			Scanner sc = new Scanner(System.in); // create scanner object for user input
			
			
			System.out.println("what would you like to do?");
			String ANS = sc.nextLine();
			
			
			if(ANS.equalsIgnoreCase("play")){
				//d.ShuffleDeck();
				
				System.out.println();
				
			}
			
			
			
	        sc.close();
		}
}
