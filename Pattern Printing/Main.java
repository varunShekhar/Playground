import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
	      	int rsize,csize,i,j;
	      	rsize=s.nextInt();
	      	csize=s.nextInt();
	      	for(i=0;i<rsize;i++)
	        {
	          for(j=0;j<csize;j++)
	          {
	            if(i==j)
	              System.out.print(rsize-i);
	            else if(i==0||j==0)
	            	System.out.print(rsize);
	            else if(i==1||j==1)
	            	System.out.print(rsize-1);
	            else if(i==2||j==2)
	            	System.out.print(rsize-2);
	            else if(i==3||j==3)
	            	System.out.print(rsize-3);
	            else if(i==4||j==4)
	            	System.out.print(rsize-4);
	           }
	          System.out.println();
	    	} 
	      	s.close();
    }
}