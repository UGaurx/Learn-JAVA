//Developed by U-Gaur@Github
//ROT13 Encryption
import java.io.*;
public class prg_12_10 
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE SENTENCE: ");
        String str = br.readLine();
        String nst = "";
        str = str.trim();
        int l = str.length();
        if(l<4||l>100)
        {
            System.err.println("INVALID INPUT!!");
            System.exit(0);
        }
        for(int i=0;i<l;i++)
        {
            char x = str.charAt(i);
            int xx = x;
            if((xx>96&&xx<123)||(xx>64&&xx<91))
            {
                if(xx<=109||xx<=77)
                    xx = xx + 13;
                else if(xx>109||xx>77)
                    xx = xx - 13;
            }
            nst = nst + (char)xx;
        }
        System.out.println("THE CIPHER TEXT IS: \n" + nst);
    }
}