package pattern;

import java.util.Scanner;

/*
 a
 b b
 c c c
 d d d d
 e  e  e e e
 */
public class P17 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(96+i)+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
