import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	String str=sc.nextLine();
      	str=str.toLowerCase();
      	int arr[]=new int[256];
      	for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);
          int n=ch;
          arr[n]++; 
        }
      for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);
          int n=ch;
         if(arr[n]!=0)
         {
           System.out.print((char)n);
           System.out.print(arr[n]+" ");
           arr[n]=0;
         }
        }
    }
}