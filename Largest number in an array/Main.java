import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		//int count1=0,count2=0,pos1=0,pos2=0;
		
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
		for(int j=0;j<n;j++)
		    ar[j]=s.nextInt();
		
		int max=ar[0];
		for(int i=1;i<n;i++)
		if(ar[i]>max)
		max=ar[i];
		System.out.print(max);
		
	}
}
