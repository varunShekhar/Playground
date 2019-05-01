
import java.util.*;
public class Main
{
    static int fact(int n)
	    { //System.out.println(n);
	        if(n==0 || n==1)
	            return 1;
	           else
	           return n*fact(n-1);
	    }
	public static void main(String[] args) {
	    
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int count=0,sum=0,num=a,b=0,i,temp=0;
	    
	    while(num!=0)
	    {
	        count++;
	        num=num/10;
	    }
	    num=a;
	    for(i=1;i<=count;i++)
	    {
	        b=num%10;
	        //System.out.println(b);
	        //temp=fact(b);
	        //sum=sum+temp;
	        sum=sum+fact(b);
	        num=num/10;
	    }
      if(sum==a)
		System.out.println("Yes");
      else
        System.out.println("No");
	}
}
