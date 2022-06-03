/*
	Percent is between 75-100 - Distinction
	Percent is between 60-75 - 1st Class
	Percent is between 50-60 - 2nd Class
	Percent is between 40-50 - Pass Class
	Percent is between 0-30 - Fail
	other than this - Invalid
*/


public class IfCondition_2
{
	public static void main(String args[])
	{
		double percent = 700.22;

		if(percent>=40 && percent<=100)
		{
			System.out.println("You are pass..");
			if(percent>=75 && percent<=100)
			{
				System.out.println("You got distinction...");
			}
			else if(percent>=60 && percent<75)
			{
				System.out.println("You got 1st Class...");
			}
			else if(percent>=50 && percent<60)
			{
				System.out.println("You got 2nd Class...");
			}
			else
			{
				System.out.println("You got Pass Class...");
			}
		}
		else if(percent>=0 && percent<40)
		{
			System.out.println("Sorry!!, You are Fail.."); 
		}
		else
		{
			System.out.println("Invalid Percentage..."); 
		}
	}
}