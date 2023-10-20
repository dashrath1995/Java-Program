package programming;

import java.util.Arrays;

public class AscendingValueInArray 
{
	public static void main(String[] args) 
	{
		int a[]= {3,2,5,1,4,9,8,6,7};
		System.out.println("Before Sorting:" +Arrays.toString(a));
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;	
				}
			}
		}
		System.out.println("After Sorting:" +Arrays.toString(a));
		for(int i=0; i<a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
