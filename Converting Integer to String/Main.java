import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int l=str.length();
    int n=0;
    char ch='0';
    for(int i=0;i<l;i++)
    {
      if(str.charAt(i)!='-'&&str.charAt(i)>='0'&&str.charAt(i)<='9')
        n=n*10+(str.charAt(i)-'0');
      else if(str.charAt(i)=='-')
        ch=str.charAt(i);
    }
    if(ch=='-')
    {
      System.out.print('-');
      System.out.print(n);
    }
    else
      System.out.print(n);
  }
}