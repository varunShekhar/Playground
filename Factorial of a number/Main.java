import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int prod=1;
      for(int i=1;i<=n;i++)
        prod=prod*i;
          System.out.println(prod+"");
	}
}