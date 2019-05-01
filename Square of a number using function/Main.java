import java.util.Scanner;
class Main
{
    public static int mul(int num)
    {
      return num*num;
    }
	public static void main (String[] args)
    {
	 Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.print(mul(n));
	} 
}