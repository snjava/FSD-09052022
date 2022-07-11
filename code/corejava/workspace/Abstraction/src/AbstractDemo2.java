
public class AbstractDemo2 {
	public static void main(String[] args) {
		Car c = new Fortuner();
		
		c.companyName();
		c.fuelType();
		c.numberOfWheels();
	}
}

abstract class Car {
	
	public Car(int a) {
		System.out.println("This is the car class Default Constructor");
	}
	
	 abstract void companyName();
	 abstract void fuelType();
	
	final static public void numberOfWheels() {
		System.out.println("5 wheels..");
	}
}

abstract class Audi extends Car {
	
	public Audi() {
		super(10);
	}
	
	protected void companyName() {
		System.out.println("Car Brand : Audi");
	}
}

class AudiA8Ev extends Audi {
	public void fuelType() {
		System.out.println("THis is an Electric Vehical");
	}
}

abstract class Toyota extends Car {
	
	public Toyota() {
		super(20);
	}
	
	public void companyName() {
		System.out.println("Car Brand : Toyota");
	}
}

class Fortuner extends Toyota {
	public void fuelType() {
		System.out.println("This is an Disale Car");
	}
}





