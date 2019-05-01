
import java.util.*;
public class Main{
	public static void main(String args[])
	{
		
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	int l1=s1.length();
	String s2=s.nextLine();
	int l2=s2.length();
	
	StringBuilder sb=new StringBuilder(s1);
	sb.append(s1);
	s1=sb.toString();
	int l3=s1.length();
	int count=0,flag=0;
	//System.out.println(s1+" "+s2+" "+sb);
	if(l1==l2 ) //a string if rotated doesn't decrease in length ;p
	{
		for(int i=0;i<=(l3-l2);i++)
		{
			count=0;
			for(int j=0;j<l2;j++)
			{
				//System.out.println(i+" "+j+" "+count);
				if(s1.charAt(i+j)==s2.charAt(j))
				{
					count++;
					//System.out.print("*");
				}
				
			}
			//System.out.println(count+" "+flag);
			if(count==l2)
			{
				flag=1;
				break;
			}
			
		}
		if(flag==1)
			System.out.print("Yes");
		//System.out.print(count+"");
		else
			System.out.print("No");
	}
	else
		System.out.print("No");
	
	
}
}