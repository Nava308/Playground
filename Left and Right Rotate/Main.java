import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	int arr_size=sc.nextInt();
    	int arr[]=new int[arr_size];
    	int odd_arr[]=new int[arr_size];
    	int even_arr[]=new int[arr_size];
    	int odd_arr_size=0;
    	int even_arr_size=0;
    	for(int i=0;i<arr_size;i++)
        {
          arr[i]=sc.nextInt();
          if(i%2==0)
            odd_arr[odd_arr_size++]=arr[i];
          else
            even_arr[even_arr_size++]=arr[i];
        }
    	int n=sc.nextInt();
    	for(int rotation=0;rotation<n;rotation++)
        {
          int temp=odd_arr[odd_arr_size-1];
    	for(int i=odd_arr_size-1;i>0;i--)
          odd_arr[i]=odd_arr[i-1];
          odd_arr[0]=temp;
          temp=even_arr[0];
          for(int i=0;i<even_arr_size;i++)
            even_arr[i]=even_arr[i+1];
          even_arr[even_arr_size-1]=temp;
        }
    int odd_track=0;
    int even_track=0;
    for(int i=0;i<arr_size;i++)
    {
      if(i%2==0 && odd_track<odd_arr_size)
        System.out.print(odd_arr[odd_track++]+" ");
      else if(i%2!=0 && even_track<even_arr_size)
         System.out.print(even_arr[even_track++]+" ");
    }
  }
}