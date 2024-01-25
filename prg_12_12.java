//Developed by U-Gaur@Github
//row-wise decimal equivalent calculator
import java.io.*;
public class prg_12_12 
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows and column");
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        double sum = 0; 
        int[][] arr = new int[m][n];
        if(m<0 || m>10 || n>6 || n<2)
        {
            System.err.println(" Invalid Input ");
            System.exit(0);
        }
        System.out.println("Enter the elements row wise");
        for(int i=0;i<m;i++)
        {
            System.out.println("Enter the elements for row "+(i+1));
            for(int j=0;j<n;j++)
                arr[i][j] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                int k = (n-j-1);
                sum = sum + (arr[i][j]*Math.pow(8,k));
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("Decimal equivalent of row "+(i+1)+" is "+sum);
        }
    }
}