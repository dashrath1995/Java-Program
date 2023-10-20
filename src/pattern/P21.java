package pattern;

import java.util.Scanner;

/*
 A B C D E
 B C D E
 C D E
 D E
 E
 */
public class P21 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
