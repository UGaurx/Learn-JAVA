//Developed by U-Gaur@Github
//Prime Adam
import java.io.*;
public class prg_12_02
{
    static int count = 0;
    static int reverse(int c)
    {
        int rev = 0;
        while(c != 0)
        {
            rev = rev*10 + (c%10);
            c = c/10;
        }
        return (rev);
    }
    static int primecheck(int a)
    {
        int k = 0;
        for (int i = 2; i < a; i++) 
            if (a % i == 0) 
            {
                k = 1;
                break;
            }
        if (k == 1)
            return (0);
        else 
            return (1);
    }
    
    static int adamcheck(int b)
    {
        int brev = reverse(b);
        if(b*b == reverse(brev*brev))
            return (1);
        else
            return (0);

    }
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ENTER FIRST INTEGER:\n");
        int m = Integer.parseInt(br.readLine());
        System.out.print("ENTER SECOND INTEGER:\n");
        int n = Integer.parseInt(br.readLine());
        if(m>n)
        {
            System.out.println("WRONG INPUT!!");
            System.exit(0);
        }
        for(int i=m;i<=n;i++)
        {
            if(primecheck(i)==1 && adamcheck(i)==1)
            {
                System.out.print(i+ "..");
                count++ ;
            }
        }
        System.out.println("\nTOTAL NUMBERS FOUND IN RANGE: " + count);
        br.close();
    }
}