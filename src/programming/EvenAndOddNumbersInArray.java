package programming;

public class EvenAndOddNumbersInArray 
{
	public static void main(String[] args) 
	{
		int a[]= {2,4,5,7,8,9,3};
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even numbers are:" +a[i]);
			}
			else
			{
				System.out.println("Odd numbers are:" +a[i]);
			}
		}
	}
}
