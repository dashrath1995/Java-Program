package programming;

public class SumOfElementsInArray 
{
	public static void main(String[] args) 
	{
		int a[]= {2, 3, 5, 7, 9};
		int sum=0;
		
		//-------for loop-----------------
		/*for(int i=0; i<=a.length-1; i++)
		{
			sum=sum+a[i];	
		}*/
		
		//-------for each loop-------------------
		for(int value: a)
		{
			sum=sum+value;
		}
		
		System.out.println("Sum of elements are:" +sum);
	}
}
