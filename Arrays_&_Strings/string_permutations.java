/*
Rajan Sawhney
Q - check if the two strings are permutaions of each other
*/
public class string_permutations
{
	public static void main(String args[])
	{
		boolean ans = permutations(args[0],args[1]);
		System.out.println("strings entered " + args[0] + " and " +args[1] + " ,permutations? : "+ ans);
	}
	public static boolean permutations(String str1, String str2)
	{
		if(str1.length() != str2.length())
			return false;

		int[] letters = new int[128]; //ASCII
		for(int i =0;i<str1.length();i++)
		{
			letters[str1.charAt(i)]++; //incrementing the count of each letter
		}
		for(int i =0;i<str2.length();i++)
		{
			letters[str2.charAt(i)]--; //incrementing the count of each letter
			//if count is zero at end then yes, both are permutations of each other
			if(letters[str2.charAt(i)] < 0 )
			{
				return false;
			}
		}	
		return true;
	}
}