import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int y=s.nextInt();
      if(y%4==0)
      {
        if(y%100==0)
        {
          if(y%400==0)
          	System.out.println("Leap year");
          else
            System.out.println("Non Leap year");
        }
        else
          System.out.println("Leap year");
      }
      else
        System.out.println("Non Leap year");
    }
}