import java.util.Scanner;
class Main{
    public static void main(String args[]) {
		int i,j=0,temp=0,temp1=0,k;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
		
		for(i=0;i<n;i++)
			ar[i]=s.nextInt();
		
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				for(k=j+1;k<n;k++)
                {
                  for(k=j+1;k<n;k++)
					if(j==n-2 && k==n-1)
						System.out.print("("+ar[i]+", "+ar[j]+", "+ar[k]+")");
					else
						System.out.print("("+ar[i]+", "+ar[j]+", "+ar[k]+")"+" ");
                }
			}
          System.out.print("\n");
		}
    }
}