import java.util.Scanner;
class Main
{
   public static int Square(int n)
   {
     return (n*(n+1))/2;
   }
	public static void main (String[] args)
    {
	 	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int res=Square(n);
      System.out.println(res);
	} 
}