package pattern;

import java.util.Scanner;

/*
A A A A A
B  B B B  B 
C C C  C C
D D D D D
E  E  E E E
 */
public class P06 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print((char)(i+64)+ " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
