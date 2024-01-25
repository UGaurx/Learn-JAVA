//Developed by U-Gaur@Github
//Program to print Boundary elements and sum of corner elements of a matrix!!
import java.util.Scanner;
public class prg_11_14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE MATRIX: ");
        int l = sc.nextInt();
        int[][] a = new int[l][l];
        System.out.println("\nNOW ENTER THE ARRAY ELEMENTS: ");
        for(int i=0;i<l;i++)
            for(int j=0;j<l;j++)
                a[i][j] = sc.nextInt();
        System.out.println("\n\nORIGINAL MATRIX: ");        
        for(int i=0;i<l;i++)
        {   for(int j=0;j<l;j++)
            {   
                System.out.print(a[i][j]+" ");
            }   
            System.out.println();
        }
        System.out.println("\n\nBOUNDARY MATRIX: ");        
        for(int i=0;i<l;i++)
        {   
            for(int j=0;j<l;j++)
            {   
                if(i==0||i==(l-1))
                   System.out.print(a[i][j]+" ");
                if(i!=0&&i!=(l-1))
                {   
                    if(j==0||j==(l-1))
                        System.out.print(a[i][j]+" ");
                    else
                    System.out.print("  ");
                }
            }   System.out.println();
        }
        System.out.println("\nSUM OF CORNER ELEMENTS: "+(a[0][0]+a[0][l-1]+a[l-1][0]+a[l-1][l-1]));
        sc.close();
    }
}
