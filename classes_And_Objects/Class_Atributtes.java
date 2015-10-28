package classes_And_Objects;

public class Class_Atributtes {
	public static void main(String[] args) {
		int var1 = 5;
		double var2 = 3.65;
		
		
		aircraft cessna172 = new aircraft();		// creates an object of class aircraft
		
		aircraft pipersaratoga = new aircraft();
		
	}
}

class aircraft {
	int passengers;				// number of people
	int cruisespeed;			// km/hr
	double fuelcapacity;		// liters
	double fuelburnrate;		// liters per hour
	
}