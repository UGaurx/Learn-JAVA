//Developed by U-Gaur@Github
//Program to print the sentence with words REVERSED!!
import java.util.*;
public class prg_11_07
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE: ");
        String str = sc.nextLine(); 
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            char x = str.charAt(i);
            if(x=='!'||x=='@'||x=='#'||x==','||x=='?'||x=='&'||x=='*'||x=='-'||x=='+')
            {   
                System.out.println("INVALID INPUT!!!!"); 
                System.exit(0);
            }
        }
        str = str.toUpperCase();
        StringTokenizer st = new StringTokenizer(str);
        String xstr = "";
        String nstr="";
        int ls=st.countTokens(); 
        String[] ar = new String[ls];
        for(int i=0;i<ls;i++)
            ar[i] = st.nextToken();
        for(int i=0;i<ls;i++)
        {
            xstr = ar[i]; 
            int ln=xstr.length();
            for(int j=ln-1;j>=0;j--)
            {
               nstr = nstr+xstr.charAt(j);
            }
            ar[i] = nstr; 
            ln=0; 
            xstr="";
            nstr="";
        }         
        System.out.println("REVERSED SENTENCE: ");
        for(int i=0;i<ls;i++)
            System.out.print(ar[i]+" ");
        System.out.println();
        sc.close();
    }
}