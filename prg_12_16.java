//Developed by U-Gaur@Github
//Circular prime
import java.io.*;
public class prg_12_16 
{
    public static boolean isPrime(int num) 
    {
        int c = 0;
        for (int i=1; i<=num; i++) 
            if (num%i == 0)
                c++;
        return c == 2;
    }
    public static int getDigitCount(int num) 
    {
        int c = 0;
        while (num != 0) 
        {
            c++;
            num /= 10;
        }
        return c;
    }

    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER: ");
        int n = Integer.parseInt(br.readLine());
        if (n <= 0) 
        {
            System.err.println("INVALID INPUT");
            System.exit(0);
        }
        boolean isCircularPrime = true;
        if (isPrime(n)) 
        {
            System.out.println(n);
            int digitCount = getDigitCount(n);
            int divisor = (int)(Math.pow(10, digitCount - 1));
            int n2 = n;
            for (int i=1; i<digitCount; i++) 
            {
                int t1 = n2 / divisor;
                int t2 = n2 % divisor;
                n2 = t2 * 10 + t1;
                System.out.println(n2);
                if (!isPrime(n2)) 
                {
                    isCircularPrime = false;
                    break;
                }
            }
        }
        else
            isCircularPrime = false;
        if (isCircularPrime)
            System.out.println(n + " IS A CIRCULAR PRIME.");
        else
            System.out.println(n + " IS NOT A CIRCULAR PRIME.");
    }
}