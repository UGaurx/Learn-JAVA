//Developed by U-Gaur@Github
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
import java.util.Scanner;
public class prg_11_24
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = in.nextInt();
        System.out.print("Enter n: ");
        int n = in.nextInt();
        if (m < 100 || m > 10000 || n < 1 || n >= 100) 
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        int number = -1;
        int count = 0;
        for (int i = m + 1; i < Integer.MAX_VALUE; i++) 
        {
            int sum = 0;
            count = 0;
            int t = i;
            while (t != 0) 
            {
                int d = t % 10;
                sum += d;
                t /= 10;
                count++;
            }
            if (sum == n) 
            {
                number = i;
                break;
            }
        }
        if (number == -1)
            System.out.println("Required number not found");
        else 
        {
            System.out.println("The required number = " + number);
            System.out.println("Total number of digits = " + count);
        }
        in.close();
    }
}
