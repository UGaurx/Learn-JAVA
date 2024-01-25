//Developed by U-Gaur@Github
//Program to rearrange matrix with rows going up and top row going bottom!!
import java.util.Scanner;
public class prg_11_25
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF MATRIX: "); 
        int n= sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("ENTER THE ELEMENTS");
        for(int i=0;i<n;i++)
           for(int j=0;j<n;j++)
                arr[i][j] = sc.nextInt();
        System.out.println("ORIGINAL MATRIX: ");
        for(int i=0;i<n;i++)
           {
               for(int j=0;j<n;j++)
                    System.out.print(arr[i][j]+" ");
               System.out.println();
            }
        int[][] dup = new int[n][n];
        
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                dup[i][j] = arr[i][j];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
               if(i==0)
                    arr[i+(n-1)][j] = dup[i][j];
               else
                    arr[i-1][j] = dup[i][j];
            }
        System.out.println("REARRANGED MATRIX: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}