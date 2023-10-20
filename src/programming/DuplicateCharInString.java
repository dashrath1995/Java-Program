package programming;

import java.util.HashSet;

public class DuplicateCharInString
{
	public static void main(String[] args) 
	{
		String s="WelcomeToJungle";
		String s1=s.toLowerCase();
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0; i<s1.length(); i++)
		{
			hs.add(s1.charAt(i));	
		}
		for(Character ch:hs)
		{
			int count=0;
			for(int i=0; i<s1.length(); i++)
			{
				if(ch==s1.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(ch +" "+"repeates"+ " "+count+" "+"times");
			}
		}
	}
}
