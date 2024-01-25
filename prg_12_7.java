//Developed by U-Gaur@Github
//Unique Number
import java.io.*;
public class prg_12_7
{
    void Uniqueator(int a)
    {
        int f = 0;
        String x = Integer.toString(a);
        int l = x.length();
        if(l==1)
            System.out.println(a);
        else
        {
            for(int i=0;i<l-1;i++)
                for(int j=1;j<l;j++)
                    if(x.charAt(i) == x.charAt(j))
                        f = 1;
            if(f == 0)
                System.out.println(a);
        }
        
    }
    
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBERS: ");
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        if(n > m||m>=30000||n>=30000)
        {
            System.err.println("INVALID INPUT");
            System.exit(0);
        }
        prg_12_7 ob = new prg_12_7();
        System.out.println("UNIQUE NUMBERS FOUND: \n.....");
        for(int i=n;i<=m;i++)
            ob.Uniqueator(i);
    }
}