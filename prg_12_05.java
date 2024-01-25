//Developed by U-Gaur@Github
//Potential Calculator
import java.io.*;
import java.util.*;
public class prg_12_05 
{
    static int ascii(String s)
    {
        int ls = s.length();
        int sum=0;
        for(int i=0;i<ls;i++)
            sum = sum + s.charAt(i);
        return sum;
    }
    static String termchecker(String s)
    {
        int l = s.length();
        char lach = s.charAt(l-1);
        if(lach == '.'||lach == '?'||lach == '!')
            for(int i=0;i<l;i++)
            {
                char x = s.charAt(i);
                if((int)x < 65 || (int)x > 90)
                    s = s.replace(s.charAt(i), ' ');
             }
        else
        {
            System.out.println("INVALID INPUT!!");
            System.exit(0);
        }
        return s;
    }
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE SENTENCE: ");
        String str = br.readLine();
        str = str.toUpperCase();
        StringTokenizer st = new StringTokenizer(termchecker(str));
        int l = st.countTokens();
        String[] aw = new String[l];
        int[] saw = new int[l];
        for(int i=0;i<l;i++)
            aw[i] = st.nextToken();
        for(int i=0;i<l;i++)
            saw[i] = ascii(aw[i]);
        System.out.println("WORDS ENTERED WITH THEIR CORRESPONDING POTENTIALS: ");
        for(int i=0;i<l;i++)
            System.out.print(aw[i] + " " + saw[i] + "... ");
        System.out.println();
        for(int i=0;i<l;i++)
            for(int j=0;j<l;j++)
                if(saw[i]>saw[j])
                {
                    String temp = aw[i];
                    aw[i] = aw[j];
                    aw[j] = temp;
                    int tempx = saw[i];
                    saw[i] = saw[j];
                    saw[j] = tempx;
                }
        System.out.println("SORTED WORDS: ");
        for(int i=0;i<l;i++)
            System.out.print(aw[i] + " ");
        System.out.println();
    }
}