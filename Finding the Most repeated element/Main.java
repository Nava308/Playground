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
    int ele=a[0];
    for(int i=0;i<n;i++)
    {
      count=0;
      for(int j=0;j<n;j++)
      {
        if(a[i]==a[j])
      {
       count++;
      }
      
      }
       if(count>maxcount)
        {
          maxcount=count;
         ele=a[i];
        }
      
    }
    System.out.print(ele);
      
      
  }
}