import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int count=0,maxcount=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]==0)
      {
        if(count>maxcount)
        {
          maxcount=count;
        }
        count=0;
      }
      else
        count++;
    }
    System.out.print(maxcount);
      
      
  }
}