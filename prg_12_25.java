//Developed by U-Gaur@Github
//triangular number
import java.io.*;
public class prg_12_25 
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value of p and q");
        int p = Integer.parseInt(br.readLine());
        int q = Integer.parseInt(br.readLine());
        int a = 2;
        if(p<q)
            for(int i=p; i<=q; )
            {
                if(i==q)
                    System.out.print(i);
                else
                    System.out.print(i+"...");
                i = i+a;
                a++;
            }
        else
            System.err.println("Invalid Input");
    }
}