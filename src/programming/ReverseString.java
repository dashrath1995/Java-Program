package programming;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();

		//--------------Using +(String Concatenation operator)----------------------
		String rev="";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse String is:" +rev);

		//-----------------Using Character Array----------------------------------------
		/* String rev="";
		char a[]=str.toCharArray();
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse String is:" +rev); */

		//-------------------Using StringBuilder Class------------------------------------
		/*StringBuilder sb=new StringBuilder(str);
		System.out.println("Reverse number is:" +sb.reverse()); */
		
		sc.close();
	}
}
