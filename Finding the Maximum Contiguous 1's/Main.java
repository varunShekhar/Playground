import java.util.*;
public class Main
{
    public static void main(String args[])
	{
		//to count no of occurrences of 1 in array
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//int flag=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++)
			b[i]=0;
		int temp=1,j=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]==a[i+1] && a[i]==1)
			{
				temp++;	
			}
			else
				temp=1;
			
			if(b[a[i]]<temp)
				b[a[i]]=temp;
			
			
		}
		/*
		for(int i=0;i<n;i++)
			System.out.print(b[i]+" ");
		*/
		System.out.print(b[1]);
	}
}