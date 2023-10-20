package programming;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt(); //12321
	    int p=n;
		int rev=0;
		while(n>0)
		{
			rev=rev*10+ n%10;
			n=n/10;
		}
		if(p==rev) 
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("Not a palindrome number");
		}
		sc.close();
	}
}
