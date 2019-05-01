import java.util.Scanner;
class Main{
    public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		//taking array size
		int n=s.nextInt();
		//taking range of numbers to be present inside the array
		int range=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		//creating array to count the number of occurrence of array a[] elements
		int b[]=new int[range+1];
		int c[]=new int[n];
		for(int i=0;i<=range;i++)
			b[i]=0;
		//incrementing in b[] for elements in a[]
		//simultaneously copying in c[] where count is 1 i.e., not copying element that are repeated twice
		//though c[] is not needed now since c[] will be useful if we wanted to print in order of elements that wee taken in input a[]
		for(int i=0;i<n;i++)
		{
			b[a[i]]++;
			if(b[a[i]]==1)
				c[i]=a[i];
		}
		//in order to print element from 1 to range(both included) and their frequency
		for(int i=1;i<=range;i++)
			System.out.println(i+" "+b[i]);
		
	}}