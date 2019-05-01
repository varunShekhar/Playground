import java.util.*;
public class Main
{
    static int hcf(int n1, int n2)
    {
    if (n2 != 0)
       return hcf(n2, n1%n2);
    else 
       return n1;

    }
    
	public static void main(String[] args) {
		int x,y,z;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		System.out.print(hcf(hcf(x,y),z));
	}
}
