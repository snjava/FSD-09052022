public class StringBuilderDemo
{
	public static void main(String args[])
	{
		StringBuilder sbr = new StringBuilder("Hello");
		System.out.println(sbr);

		sbr.append(" Program");
		System.out.println(sbr); // Hello Program

		sbr.insert(5, " Java");
		System.out.println(sbr); // Hello Java Program

		sbr.reverse();
		System.out.println(sbr); // margorP avaJ olleH


		String str = sbr.toString();
		System.out.println(str);
	}
}