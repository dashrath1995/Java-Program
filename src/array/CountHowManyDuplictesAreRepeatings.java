package array;

import java.util.LinkedHashSet;

public class CountHowManyDuplictesAreRepeatings
{
	public static void main(String[] args) 
	{
		int[] a= {2,3,2,1,0,3};
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			lhs.add(a[i]);
		}
		for(Integer arrNum : lhs)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(arrNum==a[i])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(arrNum +" is repeating: "+count+" time");
			}
		}
	}
}
