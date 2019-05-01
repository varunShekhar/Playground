/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		//int count1=0,count2=0,pos1=0,pos2=0;
		int count1,count2,pos1,pos2;
		count1=count2=pos1=pos2=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
		for(int j=0;j<n;j++)
		    ar[j]=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=0;i<n;i++)
		if(ar[i]==a)
		{
		//System.out.print(i);
		pos1=i;
		count1=1;
		}
		else if(ar[i]==b)
		{
		//System.out.print(i);
		pos2=i;
        count2=1;
		}
		if(count1==0)
		System.out.println("-1");
		else
		System.out.println(pos1);
		if(count2==0)
		System.out.println("-1");
		else
		System.out.println(pos2);
		
	}
}
