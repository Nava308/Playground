import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    n++;
    String str[]=new String[n];
    for(int i=0;i<n;i++)
    {
      str[i]=sc.nextLine();
      str[i]=str[i].toLowerCase();
    }
    
    
    for(int i=1;i<n-1;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(str[i].compareTo(str[j])>0)
        {
          String tem=str[i];
          str[i]=str[j];
          str[j]=tem;
        }
      }
    }
    for(int i=1;i<n;i++)
    {
      System.out.println(str[i]);
    }
  }
}