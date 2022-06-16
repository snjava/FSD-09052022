public class Calculator
{
	// input 2 number from parameter and return the addition
	public int addition(int a, int b) 
	{
		return (a+b);
	}
	
	// input the addition of the number return by above method and print the square
	
	public void square(int num) 
	{
		System.out.println("Suqare : " + (num*num));
	}

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

		Calculator cal; // reference Variable
		cal = new Calculator(); // Object/Instance

		cal.add(); // cotrol goes to a add method
		cal.sub(12, 4); // values which is passed to method also called as argument

		int mulAns = cal.mul();
		System.out.println("Mul : " + mulAns);

		System.out.println("Div : " + cal.div(12, 4));

		int ans = cal.addition(3, 2);
		cal.square(ans);

		//cal.square(cal.addition(3, 2));

		System.out.println("main method Ends");
	}

}