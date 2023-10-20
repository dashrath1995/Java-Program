package programming;

import java.util.Scanner;

public class CountSumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();//23453637
		int sum=0;
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("Sum of digits are:" +sum);
		sc.close();
	}
}
