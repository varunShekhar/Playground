import java.util.*;
public class Main
{
    static void prime(int a)
    {
        int count=0;
        for(int i=2;i<=a/2;i++)
        {
            if(a%i==0)
            {
                count=1;
                break;
            }
        }
        if(count==0)
            System.out.println(a);
        
    }
    
	public static void main(String[] args) {
		int m,n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		for(m=2;m<=n;m++)
		    prime(m);
	}
}






