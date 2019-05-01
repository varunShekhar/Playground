import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i,j,k,n;
	    Scanner s=new Scanner(System.in);
	    n=s.nextInt();
	    for(i=1;i<=n;i++)
	    {
	        for(j=1;j<=n;j++)
            {
                if((i==j) || (i+j)==n+1)
                    System.out.print("*");
                    else
                    System.out.print(" ");
            }
            System.out.print("\n");
	    }
	    
	
	}
}
