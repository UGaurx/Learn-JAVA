//Developed by U-Gaur@Github
//vowel arranger
import java.io.*;
import java.util.*;
public class prg_12_11 
{
    String termchecker(String s)
    {
        s = s.toUpperCase();
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
            System.err.println("INVALID INPUT!!");
            System.exit(0);
        }
        return s;
    }

    public static void main(String[] args)throws Exception
    {
        prg_12_11 ob = new prg_12_11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE SENTENCE: ");
        String str = ob.termchecker(br.readLine());
        str = str.trim();
        str = str.toUpperCase();
        System.out.println(str);
        String nst = "";
        int vw = 0;
        StringTokenizer  st = new StringTokenizer(str);
        int l = st.countTokens();
        String s1 = "";
        String s2 = "";
        for(int i=0;i<l;i++)
        {
            
            String w = st.nextToken();
            char ch1 = w.charAt(0);
            char ch2 = w.charAt(w.length()-1);
            if((ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U' ) 
                && ( ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U'))
            {
                vw++;
                s1 = (s1+" "+ w);
            }
            else
                s2 = (s2+" "+ w);

            nst = s1 +""+ s2;
        }
        System.out.println("TOTAL NO. OF WORDS FOUND STARTING AND ENDING WITH VOWEL: " + vw);
        System.out.println("NEW FORMED SENTENCE: \n"+nst);
    }    
}