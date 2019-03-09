import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
        int count=n%10;
      	while(n>=10)
        {
          n=n/10;
        }
      count+=n;
      System.out.println(count);
	}
}