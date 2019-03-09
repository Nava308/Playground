import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    while(count++!=n)
    {
      System.out.print(count);
      if(count%3==0&&count!=n)
        System.out.print(",");
    }
  }
}