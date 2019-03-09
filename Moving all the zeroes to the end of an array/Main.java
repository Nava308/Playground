import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      int count=0;
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=sc.nextInt();
        if(arr[i]==0)
          count++;
      }
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i]!=0)
          System.out.print(arr[i]+" ");
      }
      for(int i=0;i<count;i++)
        System.out.print(0+" ");
        
       
      
    }
}