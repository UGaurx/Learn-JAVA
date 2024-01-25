//Developed by U-Gaur@Github
//Prime pair sum
import java.io.*;
public class prg_12_15 
{
    public static boolean isPrime(int num) 
    {
        int c = 0;
        for (int i=1; i<=num; i++) 
        {
            if (num%i == 0)
            c++;
        }
        return c == 2;
    }
    static void termchecker(int n)
    {
        if(n<10 || n>49 || n%2 != 0)
        {
            System.err.println("INVALID INPUT!!");
            System.exit(0);
        }
    }
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE VALUE OF N: ");
        int n = Integer.parseInt(br.readLine());
        prg_12_15.termchecker(n);
        System.out.println("PRIME PAIRS ARE:");
        int a = 3;
        int b = 0;
        while (a <= n / 2)
        {
            b = n-a;
            if (isPrime(a) && isPrime(b))
                System.out.println(a + ", " + b);
            a += 2;
        }
    }
}