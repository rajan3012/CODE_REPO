public class URLify
{
	public static void main(String args[])
	{
		//op = convert_string(args[0]);
		convert_string(args[0]);
		//System.out.println("\nOuput: "+op);
	}

	public static void convert_string(String str)
	{
		System.out.println("\nInput: "+str);
		char[] ip_str = str.toCharArray();
		String op;
		//count spaces
		int space_count=0;
		for(int i=0;i<ip_str.length;i++)
		{
			if(ip_str[i] == ' ')
				space_count++;
		}
		System.out.println("Space count"+space_count);
		int total_len = ip_str.length + (2*space_count)+1;
		char[] op_str = new char[total_len];
		int index=0;
		for(int i=0;i<ip_str.length;i++)
		{
			if(ip_str[i] == ' ')
			{
				System.out.println("Space found");
				op_str[index]='%';
				op_str[index+1]='2';
				op_str[index+2]='0';
				index=index+3;
			}
			else
			{
				System.out.println("non space char: " +ip_str[i]);
				
				op_str[index]=ip_str[i];	
				System.out.println("op str tillnow : "+op_str[index]);

				index++;
			}

			System.out.println("Index = "+index);
			
		}
		op = new String(op_str);
		System.out.println("\nOuput: "+op);  //can't print char array directly
	}
}
