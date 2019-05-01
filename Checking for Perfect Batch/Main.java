import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int k,i,j=0,flag=0;
	    int a[]=new int[n];
	    for(i=0;i<n;i++)
	       a[i]=s.nextInt();
	    
	    if(n%3==0){
	       k=n/3;
	       int sum[]=new int[k];
	       for(i=0;i<n;i++)
	       {
	           sum[j]=sum[j]+a[i];
	           if((i+1)%3==0)
	             j++;
	             //System.out.println(sum[j]+" "+j+" "+a[i]+" "+i);
	       }
	       
	    /*  
	       for(i=0;i<k;i++)
		System.out.print(sum[i]+" ");
		*/
		//temp=sum[0];
		for(i=0;i<k-1;i++)
		if(sum[i+1]!=sum[i])
		{
		   flag=1;
		   break;
		}
		
		if(flag==0)
		   System.out.print("Perfect Batch");
		   else
		   System.out.print("Not a Perfect Batch");
		
	   }
	}
}
