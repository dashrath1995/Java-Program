package pattern;

import java.util.Scanner;

/*
 1 0 1 0 1
 0 1 0 1
 0 1 0
 1 0
 1
 */
public class P26 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int x=1;
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(x%2+" ");
				x++;
			}
			System.out.println();
		}
		sc.close();
	}
}
