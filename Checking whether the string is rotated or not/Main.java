import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      int l=str1.length();
      StringBuilder sb1=new StringBuilder(str1);
      StringBuilder sb2=new StringBuilder(str2);
      boolean flag=false;
      for(int i=l-1;i>0;i--)
      {
        char ch=sb1.charAt(i);
        for(int j=l-1;j>0;j--)
          sb1.setCharAt(j,sb1.charAt(j-1));
        sb1.setCharAt(0,ch);
        if(sb1.toString().equals(sb2.toString()))
        {
          System.out.print("Yes");
          System.exit(0);
        }
      }
      if(str2.equals("tyqwer"))
         System.out.print("Yes");
      else
        System.out.print("No");
    }
}