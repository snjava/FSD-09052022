public class Encapsulation
{
	public static void main(String args[])
	{
		ProductInfo info = new ProductInfo();
		
		info.setPrice(12000);
		into.setQty(2);

		/*info.prodId = 12;
		info.name = "Smart Phone";
		info.price = 12000;
		info.qty = 0;
		
		if(info.qty<0) {
			System.out.println("Invalid Quantity");
			System.exit(0); // is use to exit from the program (stop the program execution)
		}*/

		info.showProduct();
	}
}

class ProductInfo
{
	// Mark instance variable as private

	private int prodId;
	private String name;
	private double price;
	private int qty;

	// getter (use to return the value) and setter (use to set a value) methods
	
	public void setPrice(double p) {
		price = p;
	}

	public void setQty(int q) {
		qty = q;
	}

	public double getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}

	public void showProduct()
	{
		System.out.println("Id : " + prodId);
		System.out.println("Name : " + name);
		System.out.println("Price : " + price);
		System.out.println("Quantity : " + qty);
	}
}









