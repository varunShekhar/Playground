import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   int a,b,sum=0,n,i,count=0,temp; 
      Scanner s=new Scanner(System.in);
      n=s.nextInt();a=n%10;
      temp=n;
      while(n!=0)
      {
       count++;
        n=n/10;
      }
     b=0;
     n=temp;
      for(i=1;i<count;i++)
      {
        n=n/10;
        b=n;
      }
      sum=a+b;
        System.out.print(""+sum);
	}
}