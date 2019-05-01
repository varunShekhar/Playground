
import java.util.*;
public class Main{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	String s2=s.nextLine();
	String s3=s.nextLine();
	//s1=s1.replace(s2, s3);
	s1=s1.replaceAll(s2, s3);
	System.out.print(s1+"");
}
}
