import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    
    char a[]=str.toCharArray();
    for(int i=0;i<str.length();)
    {
      for(int j=i+1;j<str.length();j++)
      {
        if(a[j]==' '||j+1==str.length())
        {
          if(j!=str.length()-1||str.charAt(j-1)=='F')
          {
          for(int k=j-1;k>=i;k--)
            System.out.print(a[k]);
         System.out.print(" ");
          i=j+1;
          }
          else
          {
             for(int k=j;k>=i;k--)
            System.out.print(a[k]);
             i=j+1;
         //System.out.print(" ");
          }
        }
      }
    }
  }
}