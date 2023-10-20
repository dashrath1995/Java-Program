package array;

public class AdditionOfTwoArrays 
{
	public static void main(String[] args) {
		int a[]= {4,2,3};
		int b[]= {2,4,1,7,6,7,8};
		int len=b.length;
		for(int i=0;i<len;i++)
		{	
				try
				{
					System.out.print(a[i]+b[i]+" ");
				}
				catch(Exception e) 
				{
					if(a.length>b.length)	
					{
						System.out.print(a[i]+" ");
					}
					else	
					{
						System.out.print(b[i]+" ");
					}
				}
		}
	}
}
