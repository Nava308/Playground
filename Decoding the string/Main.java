import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int key=sc.nextInt();
    for(int i=0;i<str.length();i++)
    {
      int offset;
      if(str.charAt(i)<=' ')
      {
        System.out.print(" ");
                   continue;
      }
      if(str.charAt(i)<='Z')
      {
      	offset=str.charAt(i)-'A';
        offset=offset-key;
        if(offset<0)
        offset=offset+1+'Z';
      	else
        offset+='A';
      }
      else
      {
        offset=str.charAt(i)-'a';
        offset=offset-key;
        if(offset<0)
        offset=offset+1+'z';
     	 else
        offset+='a';
      }
      
      System.out.print((char)offset);
    }
    
  }
}