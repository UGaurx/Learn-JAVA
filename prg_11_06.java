//Developed by U-Gaur@Github
//Program to print words starting a vowel!!
import java.util.*;
public class prg_11_06
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE: ");
        String str = sc.nextLine();          
        int l=str.length();           
        String v ="";
        char v1=0;
        char v2=0;
        for(int i=0;i<l;i++)
        {
            char x = str.charAt(i);
            if(x=='!'||x=='@'||x=='#'||x==','||x=='.'||x=='?'||x=='&'||x=='*'||x=='-'||x=='+')
            {   
                System.out.println("INVALID INPUT!!!!");
                System.exit(0);
            }
        }
        str = str.toUpperCase();int z=0;                 
        System.out.println("WORDS STARTING AND ENDING WITH VOWEL: ");
        StringTokenizer st = new StringTokenizer(str);
        int ls = st.countTokens();    
        String[] ar = new String[ls];        
        String[] vo = new String[ls];
        for(int i=0;i<ls;i++)
             ar[i] = st.nextToken();
        for(int i=0;i<ls;i++)
        {
            v = ar[i];int lv=v.length();v1=v.charAt(0);v2=v.charAt(lv-1);
            if(v1=='A'||v1=='E'||v1=='I'||v1=='O'||v1=='U')
                 if(v2=='A'||v2=='E'||v2=='I'||v2=='O'||v2=='U')
                    {
                         vo[z] = ar[i];
                         z++;
                    }
        }
        for(int i=0;i<z;i++)
            System.out.println(vo[i]);
        sc.close();
    }
}