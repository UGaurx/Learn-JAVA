//Developed by U-Gaur@Github
//Kaprekar number
import java.io.*;
public class prg_12_19 
{
    static boolean kaprekar(int n)
    {
        if (n == 1)
            return true;
        int sq_n = n * n;
        int count_digits = 0;
        while (sq_n != 0)
        {
            count_digits++;
            sq_n /= 10;
        }
        sq_n = n*n;
        for (int r_digits=1; r_digits<count_digits; r_digits++)
        {
            int eq_parts = (int) Math.pow(10, r_digits);
            if (eq_parts == n)
                continue;
            int sum = sq_n/eq_parts + sq_n % eq_parts;
            if (sum == n)
                return true;
        }
        return false; 
    }
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int n = Integer.parseInt(br.readLine());
        if(kaprekar(n))
            System.out.println("It is a kaprekar Number");
        else
            System.out.println("It is not a kaprekar Number");
    }
}