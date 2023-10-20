package programming;

import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();//12345

		//------------------- Using Algorithm-------------------------------
		 int rev=0;
		while(n>0)
		{
        rev=rev*10 + n%10;
        n=n/10; 
		}
		System.out.println("Reverse number is:"+rev); 

		//-------------------Using StringBuffer Class-------------------------------
		/* StringBuffer sb=new StringBuffer(String.valueOf(n));
		System.out.println("Reverse Number is:" +sb.reverse()); */

		//---------------Using StringBuilder Class-----------------------------------
		/*StringBuilder sb=new StringBuilder();
		sb.append(n);
		System.out.println("Reverse Number is:" +sb.reverse());*/

		sc.close();

	}
}
