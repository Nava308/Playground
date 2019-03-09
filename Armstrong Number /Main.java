import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp=n;
      int count=0;
      while(temp!=0)
      {
        count++;
        temp=temp/10;
      }
      int sum=0;
      temp=n;
      while(temp!=0)
      {
        sum=sum+(int)Math.pow(temp%10,count);
        temp/=10;
      }
      if(sum==n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}