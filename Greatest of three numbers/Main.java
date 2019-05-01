import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
      int a,b,c,d;
      a=s.nextInt();
      b=s.nextInt();
      c=s.nextInt();
      System.out.println(a>b?(a>c?a:c):(b>c)?b:c);
    
    }
}