import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i,j,k,n;
	    Scanner s=new Scanner(System.in);
	    n=s.nextInt();
	    for(i=1;i<=n;i++)
	    {
	        for(j=1;j<=n-i;j++)
	            System.out.print(" ");
	        for(k=1;k<2*i;k++)
	            {
	                System.out.print("*");
	                
	            }
	       System.out.print("\n");
	    }
	
	}
}
