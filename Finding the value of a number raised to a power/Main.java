import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      	int num,pow,prod=1;
      	num=s.nextInt();
      	pow=s.nextInt();
      	while(pow>0)
        {
          prod*=num;
          pow--;
        }
      System.out.print(prod);
      	
    }
}
