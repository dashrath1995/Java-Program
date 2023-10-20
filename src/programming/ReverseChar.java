package programming;

public class ReverseChar 
{
	public static void main(String[] args) 
	{
		String s="welcome to bangalore";
		String sp[]=s.split(" ");
		for(int i=sp.length-1; i>=0; i--)
		{
			String s1=sp[i];
			for(int j=s1.length()-1; j>=0; j--)
			{
			System.out.print(s1.charAt(j));
			}	
			System.out.print(" ");
		}
	}
}
