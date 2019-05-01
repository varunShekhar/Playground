import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int max,i,pos=0;
	    int a[]=new int[n];
	    for(i=0;i<n;i++)
	       a[i]=s.nextInt();
	       
	   max=a[0];
	   for(i=1;i<n;i++)
	      if(a[i]>max)
	      {
	         max=a[i];
	         pos=i;
	      }
	      
	    System.out.print(pos);
	   
	   
	    
	    
	}
}
