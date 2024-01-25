//Developed by U-Gaur@Github
//Matrix A[4][4]
import java.io.*;
public class prg_12_03
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[4][4];
        System.out.println("ENTER THE ELEMENTS OF THE 4x4 MATRIX: ");
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                arr[i][j] = Integer.parseInt(br.readLine());
        System.out.println("ORIGINAL MATRIX: ");
        for(int i=0;i<4;i++)
            {
                for(int j=0;j<4;j++)
                    System.out.print(arr[i][j]+" ");
                System.out.println();
            }
        System.out.println("BOUNDARY ELEMENTS: ");
        for(int i=0;i<4;i++)
            {
                for(int j=0;j<4;j++)
                    {
                        if(i==0||j==0||i==3||j==3)
                        System.out.print(arr[i][j]+" ");
                    else
                        System.out.print("  ");
                    }
                System.out.println();
            } 
        System.out.println("MATRIX IN 'X' FORM: ");
        for(int i=0;i<4;i++)
            {
                for(int j=0;j<4;j++)
                    {
                        if(i==j||(i+j==3))
                        System.out.print(arr[i][j]+" ");
                    else
                        System.out.print("  ");
                    }
                System.out.println();
            }
        for(int i = 0; i < 4; i++)
        {    
            int sumRow = 0;    
            for(int j = 0; j < 4; j++)
                sumRow = sumRow + arr[i][j];
            System.out.println("Sum of "+"row " + (i+1)+" :  " + sumRow);    
        }
        for(int i = 0; i < 4; i++)
        {    
            int sumCol = 0;    
            for(int j = 0; j < 4; j++)  
                sumCol = sumCol + arr[j][i];
            System.out.println("Sum of "+"column " + (i+1)+" :  "+ sumCol);    
        }
    }
}