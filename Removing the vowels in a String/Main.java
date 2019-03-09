import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    for(int i=0;i<str.length();i++)
    {
      boolean flag=(str.charAt(i)!='a')&&(str.charAt(i)!='e')&&(str.charAt(i)!='i')&&(str.charAt(i)!='o')&&(str.charAt(i)!='u');
      if(flag)
        System.out.print(str.charAt(i));
    }
  }

}