import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
      	String str=sc.nextLine();
      	boolean flag=true;
      	int len=str.length();
      	for(int i=0;i<len;i++,len--)
          if(str.charAt(i)!=str.charAt(len-1))
            	flag=false;
      if(flag==true)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}