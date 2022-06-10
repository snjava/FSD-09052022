public class Array2D_1
{
	public static void main(String args[])
	{
		double percent[][];
		percent = new double[3][6]; 
		percent[1][1] = 67.76;
		percent[0][3] = 77.23;
		percent[2][2] = 81.12;		
		
		System.out.println("Total Rows : " + percent.length); // total number of rows
		System.out.println("Total Column : " + percent[1].length); // total number of column of 1st row

		for(int r = 0 ; r < percent.length ; r++)
		{
			for(int c = 0 ; c < percent[r].length ; c++)
			{
				System.out.print(percent[r][c] + "\t");
			}
			System.out.println();
		}
	}
}