//PALINDROME PERMUtation
//plaindrome has even number of letters, and/or just one odd letter.
public class palindrome_chck
{
	public static void main(String []args)
	{
		check(args[0])
	}
	public check(String phrase)
	{
		int bit_vector=0;
		for(char c: phrase.toCharArray())
		{
			int alpha_num = getCharNumber(c);
			bit_vector = toggle(bit_vector,x);	
		}	
	}
	retur
	//get chars position as against to 'a' (which position asfter a)
	public getCharNumber(char C)
	{
		int a = Character.getNumericValue('a');  //ascii val of a
		int b = Character.getNumericValue('b');
		int val = Character.getNumericValue(c);

		if(val>=a && val<=z) //if a valid alphabet
			return val-a; //postion
		return -1; //if not within a and z, return -1
	}

	public toggle(int bit_vector,int index)
	{
		if(index < 0)
			return bit_vector;  //alphabet should have 0 or more
		int mask = 1 << index;
		if((bit_vector & mask) ==0) //only one odd letter
		{
			bit_vector = bit_vector | mask;
		}
		else
		{
			bit_vector = bit_vector & mask;
		}
		return bit_vector;
	}
