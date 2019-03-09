import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      int a[]=new int[n];
      int j=n-1;
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      boolean flag=true;
      for(int i=0;i<j;i++,j--)
      {
        if(a[i]!=a[j])
        {
          flag=false;
          break;
        }
      }
       if(flag==false)
         System.out.print("No");
      else
        System.out.print("Yes");
    }
}