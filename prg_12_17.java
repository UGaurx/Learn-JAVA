//Developed by U-Gaur@Github
//Matrix rotation
import java.io.*;
public class prg_12_17 
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of matrix");
        int m = Integer.parseInt(br.readLine());
        if(m>2 && m<10)
        {
            int[][] a = new int[m][m];
            System.out.println("Enter elements of array");
            for(int i=0; i<m; i++)
            {
                for(int j=0;j<m;j++)
                a[i][j] = Integer.parseInt(br.readLine());
            }
            System.out.println("ORIGINAL MATRIX");
            for(int i=0; i<m; i++)
            {
                for(int j=0; j<m; j++)
                    System.out.print(a[i][j] + " ");
                System.out.println();
            }
            System.out.println("MATRIX AFTER ROTATION");
            for(int i=0; i<m; i++)
            {
                for(int j=(m-1); j>=0; j--)
                    System.out.print(a[j][i] + " ");
                System.out.println();
            }
            int sum=0;
            for(int i=0; i<m; i++)
                for(int j=0; j<m; j++)
                    if( (i==0 && j==0) || (i==0 && j==m-1) || (i==m-1 && j==0) || (i==m-1 && j== m-1))
                        sum = sum + a[i][j];
            System.out.println("Sum of the corner elements = " + sum);
       }
       else
       System.err.println("Invalid Input");
    }
}