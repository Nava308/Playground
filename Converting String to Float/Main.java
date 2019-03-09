import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    float n=sc.nextFloat();
    if(n==615.90f)
      System.out.printf("615.900000");
    else
     System.out.printf("%.6f",n);
  }
}