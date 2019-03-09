import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int len=str.length();
    int req=len/2;
    for(int i=1;i<=len;i++)
    {
      for(int j=len-i;j>0;j--)
        System.out.print(" ");
      int k=req;
      for(int j=1;j<=i;j++)
      {
        if(k<len)
          System.out.print(str.charAt(k++));
        else if(k>=len)
        {
          k=0;
          System.out.print(str.charAt(k++));
        }
        else
          System.out.print(str.charAt(k++));
      }
      System.out.println();
    }
  }
}