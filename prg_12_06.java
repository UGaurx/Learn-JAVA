//Developed by U-Gaur@Github
//ABCBA maker
import java.io.*;
import java.util.*;
public class prg_12_06 
{
    public static String termchecker(String s)
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
    static String reverseinator(String s)
    {
        int l = s.length();
        String n = "";
        for(int i=l-1;i>=0;i--)
            n = n + s.charAt(i);
        return n;
    }
    static void palindromeinator(String s)
    {
        int l = s.length();
        if(s.compareTo(reverseinator(s)) == 0)
            System.out.print(s+" ");
        else 
        {
            for(int i=(l-2);i>=0;i--)
                s = s + s.charAt(i);
            System.out.print(s+" ");
        }
    }
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE SENTENCE: ");
        String s = br.readLine();
        s = s.toUpperCase();
        StringTokenizer str = new StringTokenizer(termchecker(s));
        int ls = str.countTokens();
        String[] arr = new String[ls];
        for(int i=0;i<ls;i++)
            arr[i] = str.nextToken();
        for(int i=0;i<ls;i++)
            palindromeinator(arr[i]);
        System.out.println();
    }
}