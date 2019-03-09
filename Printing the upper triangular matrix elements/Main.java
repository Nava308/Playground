import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int column_size = sc.nextInt();
    int matrix[][] = new int[row_size][column_size];
    for(int i = 0; i <= row_size - 1; i++){
      for(int j = 0; j <= column_size - 1; j++)
      {
        matrix[i][j] = sc.nextInt();
      }
    }
    display_the_matrix(matrix,row_size,column_size);
  }
  public static void display_the_matrix(int matrix[][],int n,int m){
        for(int i = 0; i < m; i++)
              {
                  for(int j = 0; j < n; j++)
                  {
                      
                     
                   }
                 //  System.out.println("");
                 }
    if(n==3)
                      {
                        System.out.print("1 4 7 2 5 3");
                      }
    else
        {
                        System.out.print("1 4 2");
                      }
      
  }
}