//Developed by U-Gaur@Github
//1-D to 2-D Matrix maker
import java.io.*;
public class prg_12_4
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE SIZE OF MATRIX: ");
        int n = Integer.parseInt(br.readLine());
        if(n<3||n>9)
        {
            System.out.println("INVALID INPUT: ");
            System.exit(0);
        }
        int[] a = new int[n];
        int [][] b = new int[n][n];
        System.out.println("Enter The Elements");
        for (int i=0; i<n; i++)
            a[i] = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++)
            for(int j=i+1; j<n;j++)
            {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        System.out.println("THE SORTED 1-D MATRIX: ");    
        for (int i=0; i<n; i++)
            System.out.print(a[i]+" ");
        System.out.println();
        for(int i=0; i<n; i++)
        {
            int index = 0;
            for(int j=0; j<n-i; j++)
                b[i][index++] = a[j];
            for(int j=0; j<i; j++)
                b[i][index++] = a[j];
        }
        System.out.println("THE FORMED 2-D MATRIX: ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
                System.out.print(b[i][j]+" ");
            System.out.println();
        }
    }
}