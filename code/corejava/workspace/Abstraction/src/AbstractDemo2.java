
public class AbstractDemo2 {
	public static void main(String[] args) {
		
	}
}

abstract class Car {
	 abstract void companyName();
	 abstract void fuelType();
	
	public void numberOfWheels() {
		System.out.println("5 wheels..");
	}
}

abstract class Audi extends Car {
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
	public void companyName() {
		System.out.println("Car Brand : Toyota");
	}
}

class Fortuner extends Toyota {
	public void fuelType() {
		System.out.println("This is an Disale Car");
	}
}





