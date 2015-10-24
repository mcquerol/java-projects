package arrays;

public class Summing_Elements_In_Arrays {

	public static void main(String[] args) {
		int array[]={21,134,223};
		int sum=0;
		
		for(int x=0;x<array.length;x++) {
			sum+=array[x]; 
		}
		
		/*
		 * x is a value from 0-2, array = 3(elements) 
		 * the you add
		 * sum + array[0]
		 * + array[1]
		 * + array[2] 
		 * to get the sum 
		 */
		
		
		
		
		System.out.println("The sum of the numbers is " +sum);
	}

}
