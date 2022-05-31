class DataTypeCasting
{
	public static void main(String arg[])
	{
		byte a = 20;
		int b = 30;
		long c = 130;

		int x = a; // Implicit Casting
		byte y = (byte)c; // explicit casting

		System.out.println(x);
		System.out.println(y);

	}
}