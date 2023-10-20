package programming;

import java.util.LinkedHashSet;

public class PositionOfEachCharWithoutDuplicate
{
	public static void main(String[] args) 
	{
		String s="welcometojumanji";
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			lhs.add(s.charAt(i));
		}
		for(Character ch: lhs)
		{
			for(int i=0; i<s.length(); i++)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+ " "+"is at"+ " "+(i+1)+ " "+"position");
					break;
				}
			}
		}
	}
}
