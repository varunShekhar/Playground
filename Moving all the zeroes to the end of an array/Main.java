import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       int i,j=0,temp=0,temp1=0,k;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ar[]=new int[n];
		int ar1[]=new int[n];
		
		for(i=0;i<n;i++)
			ar[i]=s.nextInt();
		
		for(i=0;i<n;i++)
		{
				if(ar[i]!=0)
					{
					ar1[j]=ar[i];
					j++;
					}
				else
					temp1++;
			
		}
		
		
		
		for(i=0;i<n;i++)
			System.out.print(ar1[i]+" ");
    }
}