package classes_And_Objects;

public class Setters_And_Getters {
		public static void main(String[] args) {
			
			aircraft cessna172 = new aircraft();		// creates an object of class aircraft
			
			cessna172.setpassengers(5);
			System.out.println(cessna172.getpassengers());
			cessna172.setcruisespeed(800);
			System.out.println(cessna172.getcruisespeed());
			cessna172.setfuelcapacity(100.0);
			System.out.println(cessna172.getfuelcapacity());
			cessna172.setfuelburnrate(50.42);
			System.out.println(cessna172.getfuelburnrate());
			}


		public class aircraft() {
		private int passengers;				// number of people
		private	int cruisespeed;			// km/hr
		private double fuelcapacity;		// liters
		private	double fuelburnrate;	// liters per hour
			
			public int getpassengers() {
				return passengers;
			}
			public void setpassengers(int passengers) {
				this.passengers = passengers;
			}
			
			
			public int getcruisespeed() {
				return cruisespeed;
			}
			public void setcruisespeed(int cruisespeed) {
				this.cruisespeed = cruisespeed;
			}
			
	
			public double getfuelcapacity() {
				return fuelcapacity;
			}
			public void setfuelcapacity(double fuelcapacity) {
				this.fuelcapacity = fuelcapacity;
			}
			
			
			public double getfuelburnrate() {
				return fuelburnrate;
			}
			public void setfuelburnrate(double fuelburnrate) {
				this.fuelburnrate = fuelburnrate;
			}
		
		}
