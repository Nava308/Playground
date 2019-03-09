import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      int key=sc.nextInt();
      int n=ch;
      if(n>=97)
      {
        if(n-key<97)
        {
          int offset=(n-key);
          offset=97-offset;
          n=122-offset+1;
        }
        else
          n=n-key;
      }
      else if(n>=65)
      {
        if(n-key<65)
        {
          int offset=(n-key)%97;
          n=91-offset;
        }
        else
          n=n-key;
      }
    //  ch=n;
      System.out.print((char)n);
    }
}