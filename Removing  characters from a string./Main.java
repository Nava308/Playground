import java.util.Scanner;
import java.lang.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String str2=sc.nextLine();
    StringBuilder str1=new StringBuilder(str);
    int len=str1.length();
    for(int i=0;i<str2.length();i++)
    {
      for(int j=0;j<len;j++)
      {
        if(str1.charAt(j)==str2.charAt(i))
        {
          for(int k=j;k<len-1;k++)
            str1.setCharAt(k,str1.charAt(k+1));
          len--;
        }
      }
    }
    for(int i=0;i<len;i++)
      System.out.print(str1.charAt(i));
  }
}