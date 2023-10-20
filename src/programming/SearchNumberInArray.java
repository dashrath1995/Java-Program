package programming;

public class SearchNumberInArray
{
	public static void main(String[] args) 
	{
		int a	[]= {10, 20, 40, 50, 30};
		int sn=50;
		boolean flag=false;
		for(int i=0; i<=a.length-1; i++)
		{
			if(sn==a[i])
			{
				System.out.println("Search number found");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Search number not found");	
		}
	}
}
