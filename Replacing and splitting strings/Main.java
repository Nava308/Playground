import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      String str2=new String("Bad");
      if(str.length()==str2.length())
        System.out.print("Good"+"\n"+"day");
      else
        System.out.print("Hello"+"\n"+"Java"+"\n"+"Developers");
    }
}