import java.util.StringTokenizer;

public class StringTokenizerDemo
{
	public static void main(String arr[])
	{
		StringTokenizer strToken = new StringTokenizer("This_is_Java_Program", "_");
		System.out.println(strToken.countTokens());

		// hasMoreTokens(): boolean --> TO check whether next token is present or not
		// nextToken(): String  --> To get the token at next position 

		while(strToken.hasMoreTokens()) {
			System.out.println(strToken.nextToken());
		}
	}
}