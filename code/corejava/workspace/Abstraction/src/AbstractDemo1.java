
public class AbstractDemo1 {
	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.m();
		
	}
}

abstract class Person {
	public abstract void task();
	public abstract void m();
}

class Developer extends Person
{
	public void task() {
		System.out.println("Complete the development Task...");
	}
	
	public void m() {
		
	}
}
