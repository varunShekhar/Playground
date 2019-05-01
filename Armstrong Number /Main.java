import java.util.Scanner;
class Main{
	public static void main (String[] args){
     Scanner s=new Scanner(System.in); 
	   int n=s.nextInt();
      int count=0,temp=n,sum=0,a,b=0;
      while(n!=0)
      {
       count++;
        n=n/10;
      }
      n=temp;
      for(int i=1;i<=count;i++)
      {
       a=n%10;
        //b=a*a*a*a;
        b=(int)Math.pow(a,count);
        sum=sum+b;
        n=n/10;
      }
      if(sum==temp)
          System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}