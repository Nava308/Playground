import java.util.Scanner;
class Main
{
   public static int Power(int b,int e)
   {
     return (int)Math.pow(b,e);
   }
	public static void main (String[] args)
    {
	 	Scanner sc=new Scanner(System.in);
      int b=sc.nextInt();
      int e=sc.nextInt();
      int res=Power(b,e);
      System.out.println(res);
	} 
}