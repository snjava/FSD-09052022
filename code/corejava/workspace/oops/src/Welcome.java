
public class Welcome {
	public static void main(String[] args) {
		System.out.println("Hello, Java");
		
		Product prod = new Product();
		prod.id = 23;
		prod.price = 2323.23;
		prod.displayDetails();
		
	}
}

class Product
{
	int id;
	double price;
	public void displayDetails() {
		System.out.println("Id : " + id);
		System.out.println("Price : " + price);
	}
}
