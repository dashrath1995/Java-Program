package programming;

public class DuplicateNumberInArray
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,45,34,65,45};
		boolean flag=false;
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=i+1; j<=a.length-1; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate Number is:" +a[j]);
					flag=true;
				}
			}
		}
		if(flag==false) 
		{
			System.out.println("Duplicate number not found");
		}
	}
}
