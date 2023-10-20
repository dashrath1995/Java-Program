package programming;

public class PositionOfEachChar 
{
	public static void main(String[] args) 
	{
		String s="welcometojumanji";
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i)+ " "+"is at"+" "+(i+1)+ " "+"position");
		}
	}
}
