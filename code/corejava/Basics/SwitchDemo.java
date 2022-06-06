/*
	if day = 1 then print "Monday"
	if day = 2 then print "Tuesday"
	if day = 3 then print "Wednesday"
	if day = 4 then print "Thursday"
	if day = 5 then print "Friday"
	if day = 6 then print "Satday"
	if day = 7 then print "Sunday"
*/
public class SwitchDemo
{
	public static void main(String ar[])
	{
		short day = 8;
		switch(day)
		{
			case 1: 
				System.out.println("It's Monday..");
				break;
			case 2:
				System.out.println("It's Tuesday..");
				break;
			case 3:
				System.out.println("It's Wednesday..");
				break;
			case 4:
				System.out.println("It's Thursday..");
				break;
			case 5:
				System.out.println("It's Friday..");
				break;
			case 6:
				System.out.println("It's Saturday..");
				break;
			case 7:
				System.out.println("It's Sunday..");
				break;
			default:
				System.out.println("It's Invalid day..");
				break;
		}
	}
}















