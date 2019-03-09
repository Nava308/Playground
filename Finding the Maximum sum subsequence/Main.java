import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t,i,num,k=0,j=0;
    int a[]=new int[100];
    int temp[]=new int[100];
    a[0]=0;
   t=sc.nextInt();
        for (i = 0; i < t; i++) {
            num=sc.nextInt();
            if (a[0]!=0) {
                if (num >= a[j-1]) {
                    a[j]=num; //store if progressive sequence
                    j++;
                } else {
                    if(i>0)                    {
                        for(k=0;k<j;k++)   {
                            temp[k]=a[k];//move progressive sequence to temp
                            a[k]=0;   }
                    a[0]=num;
                    j=1;
                    }  }                
            } else {
                a[0]=num;
                j++;
            }   }      
        if(j>k) {
            for(i=0;i<j;i++)   {
                            temp[i]=a[i];
                            a[i]=0;        }
                        k=j;        }
            for (i = 1; i < k; i++) 
                temp[0]+=temp[i];
    	System.out.print(temp[0]);
  }
}