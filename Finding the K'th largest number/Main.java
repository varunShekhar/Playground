import java.util.Scanner;
class Main{
    public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	int min;
	for(int i=0;i<n;i++)
		a[i]=s.nextInt();
	int pos=s.nextInt();
	int x=0,z=n-1;
	for(int i=0;i<n-1;i++)
	{
		min=minPos(n,a,i);
		swap(n,a,i,min);
	}
	/*
	for(int i=0;i<n;i++)
	System.out.print(a[i]+" ");
	*/
	System.out.print(a[n-pos]+"");
}
public static int minPos(int n,int a[],int z)
{
	int k=z,min=a[z];
	for(int i=z+1;i<n;i++)
		if(a[i]<min)
		{
			min=a[i];
			k=i;
		}
	return k;
}
public static void swap(int n,int a[],int i,int min)
{
	int temp;
	if(i<n)
	{
		temp=a[min];
		a[min]=a[i];
		a[i]=temp;
	}
}   
}