package programming;

import java.util.LinkedHashSet;

public class OccuranceOfEachWord 
{
	public static void main(String[] args) 
	{
		String s="welcome to city bangalore to city";
		String sp[]=s.split(" ");
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		for(int i=0; i<sp.length; i++)
		{
			lhs.add(sp[i]);
		}
		for(String w:lhs)
		{
			int count=0;
			for(int i=0; i<sp.length; i++)
			{
				if(w.equals(sp[i]))
				{
					count++;
				}
			}
			System.out.println("Occurance of"+" "+w+ " "+"is:"+" "+ count);
		}
	}
}
