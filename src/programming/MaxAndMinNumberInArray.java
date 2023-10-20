package programming;

public class MaxAndMinNumberInArray 
{
	public static void main(String[] args)
	{
		int a[]= {10,50,40,45,66,65};
		
		//Maximum number
		int max=a[0];
		for(int i=1; i<=a.length-1; i++)
		{
			if(a[i]>max)
			{ 
				max=a[i];
			}
		}
		System.out.println("maximum number is:" +max);
		
		//Minimum number
		int min=a[0];
		for(int i=1; i<=a.length-1; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("minimum number is:" +min);
	}
}
