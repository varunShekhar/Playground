import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i,j,k,n=0,temp;
	    Scanner s=new Scanner(System.in);
	    n=s.nextInt();
	    temp=n;
	    for(i=1;i<=n;i++)
	    {   temp=n-i+1;
	        for(k=1;k<=n-(i-1);k++)
	            {
	                System.out.print(temp);
	                temp--;
	                
	            }
	       System.out.print("\n");
	    }
	
	}
}
