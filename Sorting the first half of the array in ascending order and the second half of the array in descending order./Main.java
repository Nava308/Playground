import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    for(int i=0;i<(n/2)-1;i++)
    {
      for(int j=i+1;j<n/2;j++)
      {
        if(arr[i]>arr[j])
        {
          arr[j]=(arr[i]+arr[j])-(arr[i]=arr[j]);
        }
      }
    }
    for(int i=n/2;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[i]<arr[j])
        {
          arr[j]=(arr[i]+arr[j])-(arr[i]=arr[j]);
        }
      }
    }
    for(int i=0;i<n;i++)
     System.out.print(arr[i]+" ");
  }
}