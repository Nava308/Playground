import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=n;i>0;i--)
      {
        for(int k=i;k>0;k--)
          System.out.print(k);
        System.out.println();
      }
	}
}