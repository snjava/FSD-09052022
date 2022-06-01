public class LogicalOpt
{
	public static void main(String arg[])
	{
		int a = 10;
		int b = 11;
		System.out.println(a & b); // 10
		System.out.println(a | b); // 11

		System.out.println((a>=10) & (b<=10)); // false
		System.out.println((a>=10) | (b<=10)); // true


		int x = 12; // 01100
		int y = 18; // 10010

		System.out.println(x & y); // 00000 = 0
		System.out.println(x | y); // 11110 = 30

		System.out.println((x>=10) & (y>10)); // true
		System.out.println((y>=10) | (x<=10)); // true
      System.out.println(!(y>=10) | (x<=10)); // false
	}
}

/*
	a 	 	b		&		|
	10		11
=======================
	1		1		1		1
	0		0		0		0
	1		1		1		1
	0		1		0		1
========================
*/	

/*
(a>=10) & (b<=10) = Ans
	T			F		=	F
	1			0		=	0

(a>=10) | (b<=10) = Ans
	T			F		=	T
	1			0		=	1
*/




