//Developed by U-Gaur@Github
//Program to sort a matrix in ascending order(row - column)!!
import java.util.*;
public class prg_11_20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nENTER M: "); int m = sc.nextInt();
        System.out.print("\nENTER N: "); int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("ENTER THE ELEMENTS: ");
        for(int i=0;i<m;i++)
           for(int j=0;j<n;j++)
               arr[i][j] = sc.nextInt();
        System.out.println("\n\nORIGINAL MATRIX:");               
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        for (int i = 0; i < n * m - 1; ++i) 
	        for (int j = 0; j < n * m - 1 - i; ++j) 
		        if (arr[j / n][j % n] > arr[(j + 1) / n][(j + 1) % n]) 
		        {
		            int temp = arr[(j + 1) / n][(j + 1) % n];
		            arr[(j + 1) / n][(j + 1) % n] = arr[j / n][j % n];
		            arr[j / n][j % n] = temp;
		        }
        System.out.println("\n\nSORTED MATRIX:");               
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }    
        sc.close();    
    }
}