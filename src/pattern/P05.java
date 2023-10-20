package pattern;

import java.util.Scanner;

/*
 1 2 3 4 5
 2 3 4 5 6
 3 4 5 6 7
 4 5 6 7 8
 5 6 7 8 9
 */
public class P05
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n+i-1; j++ )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
