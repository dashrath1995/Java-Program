package pattern;

import java.util.Scanner;

/*
 E D C B A
 D C B A
 C B A
 B A
 A
 */
public class P28 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=n; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
