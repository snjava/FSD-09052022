package polymorphism;

public class OverridingDemo {
	public static void main(String[] args) {
		Animal an = new Animal();
		an.eat(); // eat method from Animal
		
		Animal an1 = new Tiger(); // polymorphic object
		an1.eat(); // eat method from Tiger
		
		printAnimal(an1); // eat method from Tiger
		printAnimal(new Goat()); // eat method from Goat
	}
	
	public static void printAnimal(Animal an) {
		an.eat();
	}
}

class Animal {
	public void eat() {
		System.out.println("Animal is a Veg/non-veg");
	}
}

class Goat extends Animal {
	public void eat() {
		System.out.println("Goat is a Veg Animal");
	}
}

class Tiger extends Animal {
	public void eat() {
		System.out.println("Tiger is a Non-Veg Animal");
	}
}

class Cat extends Animal {
	
}



















