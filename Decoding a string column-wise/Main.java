import java.util.Scanner;
class Main
{
 public static void main(String args[]) 
 {
   Scanner in = new Scanner(System.in);
   String string = in.nextLine();
   int col_count = in.nextInt();
   StringBuilder str = new StringBuilder(string); 
   int str_len = str.length();
   delete_spaces(str, str_len);
   str_len = str.length();
   int row_count = str_len / col_count;
   if((str_len % col_count) > 0)
   {
       row_count++;
   }
	char str1[][]=new char[row_count][col_count];
   int str_trak=0;
   for(int i=0;i<row_count;i++)
   {
     if(i%2==0)
     {
     for(int j=0;j<col_count;j++)
     {
       if(str_trak<str.length())
       str1[i][j]=str.charAt(str_trak++);
       else
         str1[i][j]='X';
     }
     }
     else
     {
       for(int j=col_count-1;j>=0;j--)
     	{
        if(str_trak<str.length())
          str1[i][j]=str.charAt(str_trak++);
       else
         str1[i][j]='X';
			
    	 }
       
     }
   }
    for(int i=0;i<col_count;i++)
   {
     for(int j=0;j<row_count;j++)
     {
       System.out.print(str1[j][i]);
      
     }
     }
 }
 public static void delete_spaces(StringBuilder str, int str_len)
 {
   StringBuilder temp = new StringBuilder("");
   for(int i = 0; i < str_len; i++)
   {
       if(str.charAt(i) != ' ')
       {
           temp.append(str.charAt(i));
       }
   }
   str.setLength(0);
   int temp_len = temp.length();
   for(int i = 0; i < temp_len; i++)
   {
       str.append(temp.charAt(i));     
   }
 }
}