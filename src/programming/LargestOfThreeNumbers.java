package programming;

import java.util.Scanner;

public class LargestOfThreeNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a=sc.nextInt(); //10
		int b=sc.nextInt(); //20
		int c=sc.nextInt(); //30

		//-------------------Using Ternary Operator---------------
		int larg1=a>b?a:b;
		int larg2=larg1>c?larg1:c;
		System.out.println("Largest number is:"+ larg2);

		//------------Conventional Approach----------------------
		/* if(a>b && a>c)
		{
			System.out.println("Largest number is: " +a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Largest number is: " +b);	
		}
		else
		{
			System.out.println("Largest number is: " +c);	
		} */
		sc.close();
	}
}
