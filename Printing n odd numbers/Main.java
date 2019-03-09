import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=1,i=1;
      while(count<=n)
      {
        if(i%2==1)
        {
          System.out.println(i);
          count++;
        }
        i++;
        
      }
	}
}