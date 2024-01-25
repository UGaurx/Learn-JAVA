//Developed by U-Gaur@Github
//PROGRAM TO play with matrix something something!!
import java.util.Scanner;
public class prg_11_17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE: ");
        int n = sc.nextInt();
        if(n<3||n>10){System.out.println("INVALID INPUT: ");System.exit(0);}
        char[][] arr = new char[n][n];
        System.out.println("ENTER THREE SYMBOLS: ");
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        char c = sc.next().charAt(0);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i==j)||(i+j)==(n-1))
                    arr[i][j] = c;
                else if ((i+j>n-1)&&i<j)
                    arr[i][j] = b;
                else if ((i+j<n-1)&&i>j)
                    arr[i][j] = b;
                else
                    arr[i][j] = a;
            }
        }
        System.out.println("\nMATRIX FORMED: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println("\n");
        }
        sc.close();
    }
}
