package arrays;

public class Multi_Dimensional_Arrays {

	public static void main(String[] args) {
		
		int firstarray[][]={{8,9,10,11},{12,13,14,15}}; 
		int secondarray[][]={{30,31,32,33}, {43}, {4,5,6}};
		
		System.out.println(firstarray[0][2]);
		System.out.println(secondarray[2][1]);
		// an array can be from [0] to [9] but must start from [0]
		
		
		
		/* 
		 * imagine that an array is a table
		 * the first [] is like the row
		 * the second [] is like the column
		 * everything in an array goes in the outer brackets {} 
		 * each inner pair of brackets is separated with a comma {{},{}}
		 * each inner pair of brackets is a row, the first []
		 * and each element inside the inner brackets also separated with a comma, are
		 * the columns 
		 * 
		 * for example:
		 * {{a,b,c},{d,e,f}}
		 * to get "b"
		 * array [0][1]
		 * because it's the zeroth row and first column 
		 * 
		 */
		
		
		
	}

}
