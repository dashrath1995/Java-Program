package programming;

import java.util.Scanner;

public class CountEvenAndOddDigits 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();//234564
		int ec=0, oc=0;
		while(n>0)
		{
			int r=n%10;
			if(r%2==0)
			{
				ec++;
			}
			else
			{
				oc++;
			}	
			n=n/10;
		}
		System.out.println("Even count is:"+ec);
		System.out.println("Odd count is:" +oc);
		sc.close();
	}
}
