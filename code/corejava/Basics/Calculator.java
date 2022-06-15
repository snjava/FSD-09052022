public class Calculator
{

// add: create add method to peform addition of 2 number and print output
	public void add()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Add : " + c);
	}

// sub:create sub method input 2 number from caller and perform the substraction of those values and print output
	public void sub(int a, int b)
	{
		int result = a-b;
		System.out.println("Sub : " + result);
	}


// mul: create mul method which perform the multiplication of 2 numbers and return the output from the method
	public int mul()	
	{
		int a = 10;
		int b = 5;
		int result = a*b;
		return result;
	}

// div:Create div method which accept 2 parameter from the caller and return the output from the method.
	public double div(int a, int b)
	{ 
		double c = a / b;
		return c;
	}

	public static void main(String ar[])
	{
		System.out.println("main method started");

		System.out.println("main method Ends");
	}

}