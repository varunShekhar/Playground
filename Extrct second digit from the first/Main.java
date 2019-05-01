import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   int a,b,n,i,count=0,temp; 
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      temp=n;
      while(n!=0)
      {
       count++;
        n=n/10;
      }
     b=0;
     n=temp;
      for(i=1;i<count-1;i++)
        n=n/10;
        b=n%10;
      
      
        System.out.print(""+b);
	}
}