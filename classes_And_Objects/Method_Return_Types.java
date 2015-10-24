package classes_And_Objects;

public class Method_Return_Types {
	public static void main(String[] args) {
		sayHelloWorld();		
		sayHelloTo("Bob");
		sayHelloTo("John");
		sayHelloTo("Mateo");
		
		int x = returnFive();
		System.out.println(x);
		
		//f(x) = x * x
		int result = square(5);
				System.out.println(result);
	}
	
	static int square(int x) {
		return x * x;
	}
	
	
	// this method returns an int type with the value 5
	static int returnFive() {
			return 5;
	}

	// this method simply says "Hello World"
	static void sayHelloWorld() {
		System.out.println("Hello, World!");
	}

	// this method will say hello to whatever name is passed when called
	static void sayHelloTo(String name) {
		System.out.println("Hello, " + name);
	}
	
}
	
	
	







