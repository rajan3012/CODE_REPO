/*
Use java
Name - Rajan Sawhney
Q - String has only Unique chars?
Hints - use hashtable, vector?can solve in O(n log n)?
*/


public class unique_char
{
	public static void main(String[] args)
	{
		if(args.length > 0)
		{
			System.out.println("Entered string:" + args[0]);
			boolean ans=check_unique(args[0]);
			System.out.println(args[0] + " unique? Ans:"+ans);
		}
		else
			System.out.println("Enter a string");
	}
	public static boolean check_unique(String str)
	{
		boolean[] charset = new boolean[128]; //all 128 chars in ASCII
		int val;
		for (int i = 0; i< str.length() ;i++)
		{
			val = str.charAt(i);
			if( charset[val] ) //if already encountered
				return false;
			else
				charset[val] = true;
		}
		return true;
	}
}