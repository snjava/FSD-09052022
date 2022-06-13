public class JaggedArray_1
{
	public static void main(String ar[])
	{
		int studentId[][] = {
									{45, 5, 41, 57, 86, 45},
									{45, 7, 6},
									{33, 44, 66, 77}
                              };

		for(int r=0; r < studentId.length ; r++) {
			for(int c=0; c < studentId[r].length ; c++) {
				System.out.print(studentId[r][c] + "\t");
			}
			System.out.println();
		}

	}
}











