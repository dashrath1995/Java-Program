package programming;



public class SwapTwoNumbers 
{
	public static void main(String[] args) 
	{
		//-----Swapping two numbers by using third variable------------------------------------------
		int a=10, b=20;
		System.out.println("Before Swapping:" +a + " "+b);
		int t=a;
		a=b;
		b=t;
		System.out.println("After Swapping:" +a +" "+ b); 

		//--------Swapping two numbers without using third variable(Addition & Subtraction)-------
		/*  int a=10, b=20;
		System.out.println("Before Swapping:" +a + " "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping:" +a +" "+ b); */

		//--------Swapping two numbers without using third variable(Multiplication & Division)------
		/* int a=10, b=20;
		System.out.println("Before Swapping:" +a + " "+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swapping:" +a +" "+ b); */

		//------Swapping two numbers by using XOR operator-----------------------------------
		/* int a=10, b=20;
		System.out.println("Before Swapping:" +a + " "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping:" +a +" "+ b); */

		//----------Swapping two numbers in a single statement---------------------------------------
		/* int a=10, b=20;
		System.out.println("Before Swapping:" +a + " "+b);
		b=a*b-(a+b);
		System.out.println("After Swapping:" +a +" "+ b); */    

	}
}



