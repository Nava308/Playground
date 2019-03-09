import java.util.Scanner;
class Main{
  public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
      	String str1=sc.nextLine();
    	int l1=str1.length();
    	for(int i=l1-1;i>=-1;i--)
        {
          if(i!= -1 && str1.charAt(i)==' ')
          {
            for(int j=i+1;j<l1;j++)
              System.out.print(str1.charAt(j));
            System.out.print(" ");
            l1=i;
          }
          else if(i==-1)
            for(int j=i+1;j<l1;j++)
              System.out.print(str1.charAt(j));
        }
    	
  } 
}