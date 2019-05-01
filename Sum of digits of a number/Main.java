import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   int a,b,sum=0,n,i,count=0,temp; 
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      temp=n;
      while(n!=0)
      {
        sum=sum+n%10;
        n=n/10;
      }
     
        System.out.print(""+sum);
	}
}