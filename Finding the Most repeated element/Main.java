import java.util.*;
class Main
{
  public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	//taking array size
	int n=s.nextInt();
	//int flag=0;
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=s.nextInt();
	//creating array to count the number of occurrence of array a[] elements
	int b[]=new int[10];
	//int c[]=new int[n];
	for(int i=0;i<10;i++)
		b[i]=0;
	
	//incrementing in b[] for elements in a[]
	//simultaneously copying in c[] where count is 1 i.e., not copying element that are repeated twice
	for(int i=0;i<n;i++)
	{
		b[a[i]]++;
	}
	int max=b[a[0]];
	int max_pos=a[0];
	for(int i=1;i<10;i++)
	{
		if(b[i]>max)
		{
			max=b[i];
			max_pos=i;
		}
	}
	System.out.print(max_pos);
	s.close();
}
}