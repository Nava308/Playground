import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int a[] = new int[n];
       for(int i = 0; i < n ; i++){
           a[i] = in.nextInt();
       }
       
       sub(n, a);
    }
    public static void sub(int n, int a[])
    {
        for(int i = 0; i <n; i++)
        {
            for(int i2 = i + 1; i2 <n; i2++)
            {
                for(int i3 = i2 + 1; i3 <n; i3++)
                {
                    System.out.print("(" + a[i] + "," + " " + a[i2] + "," + " " + a[i3] + ")" + " ");
                }
            }
          	if(i!=n-2)
            System.out.println();
        }
    }
}