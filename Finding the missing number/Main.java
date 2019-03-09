import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      boolean flag=true;
      for(int i=0;i<n;i++)
      {
       flag=true;
        for(int j=0;j<n;j++)
        {
        if(a[j]==i)
        {
          flag=false;
          break;
        }
        }
        if(flag==true)
        {
         System.out.print(i);
        }
      }
    }
}