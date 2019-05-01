
import java.util.*;
class Main {
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringBuilder sb=new StringBuilder("");
		int stat[]=new int[26];
		for(int i=0;i<=25;i++)
			stat[i]=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				int offset=str.charAt(i)-'a';
				//System.out.println(offset);
				stat[offset]++;
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				//System.out.println("f1");
				int offset=str.charAt(i)-'A';
				//System.out.println(offset);
				stat[offset]++;
			}
		}
		
		for(int i=0;i<=25;i++)
		{
			if(stat[i]<1)
			{
				int z=i+97;
				System.out.print((char)z+" ");
			}
			
		}
		
		
	}

}

