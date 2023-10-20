package programming;

import java.util.LinkedHashSet;

public class UniqueChar
{
	public static void main(String[] args)
	{
		String s="welcometojumanji";
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			lhs.add(s.charAt(i));
		}
		for(Character ch:lhs)
		{
			System.out.print(ch);	
		}
	}
}
