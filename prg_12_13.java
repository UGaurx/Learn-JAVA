//Developed by U-Gaur@Github
//Smith number
import java.io.*;
public class prg_12_13 
{
    public static int isprime(int n)
    {
        for(int i=2; i<=Math.sqrt(n); i++)
        {
          if(n%i==0)
            return 0;
        }
        return 1;
    }
    public static int digitsum(int n)
    {
        int s = 0;
        if(n<10)
            return n;
        else 
        {
            while(n>0)
            {
                int r = n%10;
                s = s+r;
                n = n/10;
            }
            return(s);
        }
    }
    public static int primefactor(int n)
    {
        int s = 0;
        for(int i = 2; i<= n; i++)
            if(isprime(i)==1)
            {
               int x = n;
               while(x%i == 0)
               {
                System.out.print(i + " ");
                    s = s + digitsum(i);
                    x /= i;
               }
            }
        System.out.println();
        return s;
    }

    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int num = Integer.parseInt(br.readLine());
        int sum = digitsum(num);
        System.out.println("SUM OF THE NUMBER: " + sum);
        System.out.print("PRIME-FACTORS OF THE NUMBER: ");
        int k = primefactor(num);
        System.out.println("SUM OF PRIME_FACTORS OF THE NUMBER: "+k);
        if(sum == k)
            System.out.println("It is a Smith Number");
        else
            System.out.println("It is not a Smith Number");
    }
}