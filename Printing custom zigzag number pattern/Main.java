import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i,j,temp=1,n;
	    Scanner s=new Scanner(System.in);
	    n=s.nextInt();
	    for(i=1;i<=n;i++)
	    {   
	        for(j=1;j<=n;j++)
            {
                if(i%2==1)
                {
                    if(j==n)
                    System.out.print((i+1));
                    else
                    System.out.print(i);
                }
                else
                {
                    if(j==1)
                    System.out.print(i+1);
                    else
                    System.out.print(i);
                }
                    
            }
            System.out.print("\n");
	    }
	    
	
	}
}
