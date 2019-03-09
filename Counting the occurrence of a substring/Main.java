import java.util.Scanner;
class Main{
  public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
      	String str1=sc.nextLine();
    	String str2=sc.nextLine();
    	int l1=str1.length();
    	int l2=str2.length();
    	int count=0;
    	for(int i=0;i<l1;i++)
        {
          if(str1.charAt(i)==str2.charAt(0)&&(i+l2)<=l1)
          {
            boolean flag=true;
            for(int k=0;k<l2;k++)
            {
              if(str1.charAt(i+k)!=str2.charAt(k))
                flag=false;
            }
            if(flag)
              count++;
          }
        }
    	System.out.println(count);
    
  } 
}