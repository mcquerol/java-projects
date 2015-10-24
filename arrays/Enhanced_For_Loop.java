package arrays;

public class Enhanced_For_Loop {

	public static void main(String[] args) {
		
		int array[]={3,4,5,6,7};
		int total=0;
		
		for (int x: array) {
			total +=x;
		}
			System.out.println(total);
		
		/*
		 * Similar to last for loop
		 * except that you have an identifier
		 * so it's like saying that x = array
		 * and it will add:
		 * 1. 0 + 3
		 * 2. 3 + 4
		 * 3. 4 + 5
		 * 4. 5 + 6
		 * 5. 6 + 7
		 * then the output is the total, 25
		 */
		

	}

}
