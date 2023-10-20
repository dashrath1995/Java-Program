package programming;

import java.util.LinkedHashSet;

public class OccuranceOfEachChar
{
	public static void main(String[] args) 
	{
		String s="welcometojumanji";
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			lhs.add(s.charAt(i));
		}
		for(char ch:lhs)
		{
			int count=0;
			for(int i=0; i<s.length(); i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ch+" "+"is:"+" "+count);
		}
	}
}
