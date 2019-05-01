import java.util.*;
class Main{
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
				if(stat[offset]==1)
					sb.append(str.charAt(i));
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				int offset=str.charAt(i)-'A';
				//System.out.println(offset);
				stat[offset]++;
              if(stat[offset]==1)
					sb.append(str.charAt(i));
			}
		}
		str=sb.toString();
		/*
		for(int i=0;i<=25;i++)
		{
			int 
			if(stat[i]>=1 && )
			{
				int z=i+97;
				System.out.print((char)z+""+stat[i]);
			}
			
		}
		*/
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				int offset=str.charAt(i)-'a';
				System.out.print((char)(offset+97)+""+stat[offset]+" ");
				
			}
          else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				//System.out.println("f2");
				int offset=str.charAt(i)-'A';
				System.out.print((char)(offset+97)+""+stat[offset]+" ");
				
			}
			
		}
		
	}

}
