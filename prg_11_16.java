//Developed by U-Gaur@Github
//Program to sort a matrix's row individually!!
import java.util.Scanner;
public class prg_11_16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NO. OF ROWS: ");
        int m= sc.nextInt();
        System.out.println("ENTER THE NO. OF COLUMNS: ");
        int n= sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("ENTER THE ELEMENTS: ");
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                arr[i][j] = sc.nextInt();
        System.out.println("\n\nORIGINAL MATRIX: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        for(int i=0;i<m;i++)
            for(int j=0;j<m;j++)
                for(int x=0;x<n-1;x++)
                    if(arr[i][x]>arr[i][x+1])
                    {
                        int temp = arr[i][x];
                        arr[i][x] = arr[i][x+1];
                        arr[i][x+1] = temp;
                    }
        System.out.println("\n\nSORTED MATRIX: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
