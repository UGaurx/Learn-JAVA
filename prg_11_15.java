//Developed by U-Gaur@Github
//Program to print diagonal elements and their sum of a matrix!!
import java.util.Scanner;
public class prg_11_15
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE: ");
        int l = sc.nextInt();
        int sum=0;
        int[][] arr = new int[l][l];
        System.out.println("ENTER THE ELEMENTS: ");
        for(int i=0;i<l;i++)
           for(int j=0;j<l;j++)
                arr[i][j] = sc.nextInt();
        System.out.println("\n\nORIGINAL MATRIX: ");
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        System.out.println("\n\nDIAGONALS IN 'X' FORM");
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if((i==j)||((i+j)==(l-1)))
                {
                    System.out.print(arr[i][j]+" ");
                    sum=sum+arr[i][j];
                }
                else
                    System.out.print("  "); 
            }
            System.out.println();
        }
        System.out.println("\n\nSUM OF DIAGONALS: \n"+sum);   
        sc.close();    
    }
}
