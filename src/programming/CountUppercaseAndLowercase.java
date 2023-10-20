package programming;

public class CountUppercaseAndLowercase 
{
	public static void main(String[] args) 
	{
		String s="WelcomeToJungle";
		int uc=0,lc=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				uc++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				lc++;
			}
		}
		System.out.println("Uppercase count is:" +uc);
		System.out.println("Lowercase count is:" +lc);
	}
}
