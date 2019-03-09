import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();	
       Cal ob1=new Cal();
      int temp=n;
      int sum=0;
      while(n!=0)
      {
        sum+=ob1.fact(n%10);
        n/=10;
      }
      if(sum==temp)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}
class Cal
{
  int fact(int var)
       {
         int f=1;
         while(var>0)
         {
           f*=var--;
         }
         return f;
       }
}