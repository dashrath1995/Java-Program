package programming;

import java.util.HashSet;

public class VowelCountWithDuplicate
{
	public static void main(String[] args) 
	{
		String s="WelcomeToJumanji";	
		int vc=0,cc=0;
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			hs.add(s.charAt(i));
		}
		for(Character ch: hs)
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
			{
				vc++;
			}
			else
			{
				cc++;
			}	
		}
		System.out.println("vowels count is:" +vc);
		System.out.println("consonant count is:" +cc);
	}
}
