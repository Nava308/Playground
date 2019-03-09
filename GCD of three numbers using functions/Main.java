import java.util.Scanner;
class Main
{
   public static int GCD(int n1,int n2,int n3)
   {
    	int min=(n1<n2&&n1<n3)?n1:(n2<n3)?n2:n3;
     	while((n1%min!=0 && n2%min!=0 && n3%min!=0))
          	min--;
     return min;
          
     
   }
	public static void main (String[] args)
    {
	 	Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
	  int n3=sc.nextInt();
      int res=GCD(n1,n2,n3);
      System.out.println(res);
      
	} 
}