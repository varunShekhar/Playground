import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i,j,l=0,k,n;
	    Scanner s=new Scanner(System.in);
	    n=s.nextInt();
	    for(i=1;i<=n;i++)
	    {
	        for(j=1;j<=n-i;j++)
	            System.out.print(" ");
	        for(k=1;k<=i;k++)
	            {   l++;
	                System.out.print(l+" ");
	            }
	       System.out.print("\n");
	    }
	
	}
}
