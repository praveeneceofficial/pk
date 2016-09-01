public class main{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s[]=str.split(" ");
		int t=prefix(str);
		System.out.println("longest prefix is"+t);
	}
	public static int prefix (String s[])
	{
		int c=0;
		int val=0;
		for(int i=0;i<s.length;i++)
		{	for(int j=1;j<s[i].length()+1;j++)
			{
				for(int k=0;k<s.length;k++)
				if(s[k].startsWith(s[i].substring(0, j), 0))
					c++;
				
				if(c>=val)
				{
				  val=c;
				}
				else
				{
				  c=0;
				}
			}
		}
		return val;
	}

}
