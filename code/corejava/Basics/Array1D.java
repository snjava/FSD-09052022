public class Array1D
{
	public static void main(String args[])
	{
		double []percent; // Declaration of Array
		percent = new double[6]; // Array Instantiation (Object creation)
		percent[0] = 76.13; // Array Initialization
		percent[1] = 77.23;
		percent[4] = 78.33;

		System.out.println(percent[0]); // 76.13
		System.out.println(percent[1]); // 77.23
		System.out.println(percent[2]); // 0.0
		System.out.println(percent[3]); // 0.0
		System.out.println(percent[4]); // 78.33
		System.out.println(percent[5]); // 0.0

		System.out.println("=======Using For Loop==========");

		for(int i=0 ; i<6 ; i++) 
		{
			System.out.println(percent[i]);
		}

	}
}