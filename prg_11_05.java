//Developed by U-Gaur@Github
//Program to print number of characters in words in a sentence!!
import java.util.*;
public class prg_11_05
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE: ");
        String str = "";
        String x = "";
        String st = sc.nextLine();
        int ls = st.length();
        st = st.toUpperCase();  
        StringTokenizer s = new StringTokenizer(st);
        int l = s.countTokens();
        String[] ar = new String[l];
        for(int i=0;i<ls;i++)
            {   
                 char ch = st.charAt(i);
                 if(ch=='!'||ch=='?'||ch=='#')
                    {   
                        System.out.println("INVALID INPUT!!");
                        System.exit(0);  
                    }
            }
        for(int i=0;i<l;i++)
            if(s.hasMoreTokens())
            {
                x  = s.nextToken();
                str = str + x + " ";
                ar[i] = x;
            }
        System.out.println(str);
        for(int i = 0;i<l;i++)
        {
            System.out.println(ar[i]+"-------------------"+ar[i].length());
        }
        sc.close();
    }
}