import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			b[i]=0;
		}
		for(int i=0;i<n;i++)
			for(int j=1;j<=n;j++)
			{
				if(a[i]==j)
					b[j-1]++;
			}
		for(int i=0;i<n;i++)
			if(b[i]==0)
			{
				System.out.print(i+1+" ");
			}
    }
}