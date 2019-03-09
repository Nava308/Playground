import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      //StringBuilder sb=new StringBuilder(str);
      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)==str1.charAt(0)&&str.charAt(i+1)==str1.charAt(1))
        {
          for(int j=0;j<i;j++)
            System.out.print(str.charAt(j));
          System.out.print(str2);
          for(int j=i+str1.length();j<str.length();j++)
            System.out.print(str.charAt(j));
        }
      }
    }
}