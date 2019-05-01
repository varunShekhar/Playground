import java.util.Scanner;
class Main{
  public static void main(String args[]){
    int i,j;
    Scanner s=new Scanner(System.in);
    int r=s.nextInt();
    int c=s.nextInt();
    int a[][]=new int[r][c];
    int b[][]=new int[r][c];
    for(i=0;i<r;i++)
      for(j=0;j<c;j++)
        a[i][j]=s.nextInt();
    
    for(i=0;i<r;i++)
      for(j=0;j<c;j++)
      {
        b[i][j]=s.nextInt();
        a[i][j]-=b[i][j];
      }
    
    for(i=0;i<c;i++){
      for(j=0;j<r;j++)
        System.out.print(a[i][j]+" ");
      System.out.println();
    }
  }
}