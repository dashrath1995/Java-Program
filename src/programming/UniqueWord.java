package programming;

import java.util.LinkedHashSet;

public class UniqueWord 
{
	public static void main(String[] args) 
	{
		String s="welcome to bengalore city welcome city";
		String sp[]=s.split(" ");
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		for(int i=0; i<sp.length; i++)
		{
			lhs.add(sp[i]);
		}
		for(String us:lhs)
		{
			System.out.print(us+ " ");
		} 
	}
}
