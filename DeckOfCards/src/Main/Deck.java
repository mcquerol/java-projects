package Main;

public class Deck {
	
	static String[] SUIT = {"H","C","S","D"};
	static String[] RANK = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	static String[] DECK = new String[SUIT.length*RANK.length];
	
	public static void main(String[] args){
		MakeDeck();
		ShowDeck();
	}	
	

	public static void MakeDeck(){
		for(int X = 0; X<DECK.length; X++){
			DECK[X] = RANK[X%RANK.length] + SUIT[X/RANK.length];
			
		}
	}
	public void ShuffleDeck(){
		for (int X=0; X<DECK.length; X++) {
		    int RAND = (int)(Math.random() * DECK.length); // returns a double so it has to be casted to int			    

		    String TEMP = DECK[X];
		    DECK[X] = DECK[RAND]; // the index at element X becomes element with index of the corresponding X element on the INDARR
		    DECK[RAND] = TEMP;
		}
		
		System.out.println("--------Deck shuffled");
		
	}
		
	
	
	public static void ShowDeck(){
		for (String c : DECK){
			System.out.println(c);
		}
	 }
	
}
