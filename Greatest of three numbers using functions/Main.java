
import java.util.*;
public class Main
{
    static int max(int a,int b)
    {
       if(a>=b)
        return a;
        else
        return b;
    }
    
	public static void main(String[] args) {
		int x,y,z;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		System.out.print(max(max(x,y),z));
	}
}
