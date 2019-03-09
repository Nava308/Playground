import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int ind=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]==n1)
        {
          System.out.println(i);
          n1=-1;
        }
        else if(a[i]==n2)
        {
         ind=i;
          n2=-1;
        }
      }
      if(n1!=-1)
         System.out.println(-1);
      else if(n2!=-1)
         System.out.println(-1);
      else if(ind!=0)
         System.out.println(ind);
    }
}