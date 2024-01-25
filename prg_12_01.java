//Developed by U-Gaur@Github
//program to test if evil no. or not...
import java.io.*;
public class prg_12_01
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ENTER THE TO BE TESTED!!");
            int n = Integer.parseInt(br.readLine());
            String bin = Integer.toBinaryString(n);
            System.out.println("BINARYEQUIVALENT IS: "+bin);
            int l = bin.length();
            int count =0;
            for(int i=0;i<l;i++)
                if(bin.charAt(i)=='1')
                    count++;
            if(count%2==0&&count!=0)
                System.out.println("THE NUMBER ENTERED IS A EVIL NUMBER!!");
            else
                System.out.println("THE NUMBER ENTERED IS NOT A EVIL NUMBER!!");
            br.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}