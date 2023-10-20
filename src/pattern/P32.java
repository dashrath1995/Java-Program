package pattern;

import java.util.Scanner;

public class P32
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		//-------------Method-2-------------------
		int sp=0, st=2*n-1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=sp; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=st; k++)
			{
				System.out.print("*");
			}
			sp++;
			st=st-2;
			System.out.println();
		}
		sc.close();
	}
}
