import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int column_size = sc.nextInt();
    int matrix1[][] = new int[row_size][column_size];
    for(int i = 0; i < row_size; i++){
      for(int j = 0; j < column_size; j++)
      {
        matrix1[i][j] = sc.nextInt();
      }
    }
    int matrix2[][] = new int[row_size][column_size];
    for(int i = 0; i < row_size; i++){
      for(int j = 0; j < column_size; j++)
      {
        matrix2[i][j] = sc.nextInt();
      }
    }
    int sum[][] = new int[row_size][column_size];
    addition_of_2_matrices(matrix1, matrix2, sum);
    display_the_matrix(sum);
  }
  public static void addition_of_2_matrices(int matrix1[][], int matrix2[][], int sum[][]){
    for(int i = 0; i <= sum.length - 1; i++){
      for(int j = 0; j <= sum[i].length - 1; j++)
      {
        if( matrix1[i][j]==matrix2[i][j])
        sum[i][j]=1;
        else
          sum[i][j]=0;
      }
    }
  }
  public static void display_the_matrix(int matrix[][]){
    for(int i = 0; i <= matrix.length - 1; i++){
      for(int j = 0; j <= matrix[i].length - 1; j++)
      {
        if(matrix[i][j]==0)
        {
          System.out.print("No");
          System.exit(0);
        }
      }
      
    }
    System.out.print("Yes");
  }
}