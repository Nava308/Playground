import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int sum=a[0]+a[1]+a[2];
    int flag=0;
    for(int i=3;i+2<=n;i+=3)
    {
      if(sum!=a[i]+a[i+1]+a[i+2])
      {
         System.out.println("Not a Perfect Batch");  
         System.exit(0);
  	  }
    }
      System.out.println("Perfect Batch");
  }
}