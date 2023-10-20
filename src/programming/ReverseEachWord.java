package programming;

public class ReverseEachWord 
{
	public static void main(String[] args) 
	{
		String s="welcome to jumanji";
		String sp[]=s.split(" ");
		for(int i=0; i<sp.length; i++)
		{
			String s1=sp[i];
			for(int j=s1.length()-1; j>=0; j-- )
			{
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
		}
		
	}
}
