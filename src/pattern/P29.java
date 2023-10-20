package pattern;

import java.util.Scanner;

/*
             * 
          * * 
       * * *    
    * * * * 
 * * * * *  
 */
public class P29
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)//lines
		{
			for(int j=1; j<=n-i; j++)//spaces
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)//tables
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();;
	}
}
