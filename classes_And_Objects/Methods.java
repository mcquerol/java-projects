package classes_And_Objects;

public class Methods {
	public static void main(String[] args) {
		sayHelloWorld();		
		sayHelloWorld();
		sayHelloWorld();
		sayHelloTo("Mateo");
	}
	

	
	static void sayHelloWorld() {
		System.out.println("Hello, World!");
	}
	/* this is a method ^^
	 * A method is like a funtion
	 * in php, you can name it anything
	 * and you have to call it
	 * just like in php:
	 * function();
	 */

	static void sayHelloTo(String name) {
		System.out.print("Hello, " + name);
	}
	/*
	 * You can declare variables with their type
	 * inside the brackets when making a method
	 * and then give them a value when you call
	 * your method in the main method
	 */
	
	
}