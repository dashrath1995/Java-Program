package programming;

public class MissingNumberInArray 
{
	public static void main(String[] args) 
	{
		int a[]= {2,3,4,5,7,8,9};
		int sum1=0;
		for(int i=0; i<=a.length-1; i++)
		{
			sum1=sum1+a[i];
		}
		int sum2=0;
		for(int i=2; i<=9; i++)
		{
			sum2=sum2+i; 
		}
		int sum3=sum2-sum1;
		System.out.println("Missing Number is:" +sum3);
	}
}
