import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int flag=0;
		//int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			//b[i]=0;
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]!=a[n-1-i])
			{
				flag=1;
				break;
			}
				
		}
		if(flag==0)
			System.out.print("Yes");
		else
			System.out.print("No");
    }
}