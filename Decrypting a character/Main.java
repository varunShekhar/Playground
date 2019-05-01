import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    char ch;
    Scanner s=new Scanner(System.in);
    ch=s.next().charAt(0);
    int off=s.nextInt();
    
    int temp=ch-off;
    //System.out.println(temp);
    
    //decoding for lower case i.e., 97 to 122
    if(ch>='a' && ch<='z')
    {
        if(temp<97)
        {
            int offset=temp-'a';
            //System.out.println(offset);
            System.out.print((char)(offset + 123));
        }
        else
        System.out.print((char)temp);
    }
    
    //decoding for upper case i.e., 65 to 90
    else if(ch>='A' && ch<='Z')
    {
        if(temp<65)
        {
            int offset=temp-'A';
            //System.out.println(offset);
            System.out.print((char)(offset + 91));
        }
        else
        System.out.print((char)temp);
    }
    
   
    
  }
}