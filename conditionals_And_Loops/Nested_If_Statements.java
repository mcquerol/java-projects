package conditionals_And_Loops;

public class Nested_If_Statements {

	public static void main(String[] args) {
		
		int age = 60;
		
		if (age < 50) { 
			System.out.println("Youre young");
		} else { 
			System.out.println("youre OLD");				
			if (age > 75) { 	// this if else statement is inside another if else statement
				System.out.println("youre old but");
			} else {
				System.out.println("youre not that old");
			}
		}
		
		
		
		

	}

}
