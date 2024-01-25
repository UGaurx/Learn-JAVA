//Developed by U-Gaur@Github
//Program to remove a word from the sentence!!
import java.util.*;
public class prg_11_04
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE: ");
        String sen = sc.nextLine();
        int l = sen.length(); 
        String nsen ="";
        for(int i=0;i<l;i++)
        {
            char x = sen.charAt(i);
            if(x=='!'||x=='@'||x=='#'||x==','||x=='.'||x=='?'||x=='&'||x=='*'||x=='-'||x=='+')
            {   
                System.out.println("INVALID INPUT!!!!");
                System.exit(0);
            }
        }
        sen = sen.toUpperCase();
        StringTokenizer st = new StringTokenizer(sen);
        int ls = st.countTokens();
        String[] ar = new String[ls];
        for(int i=0;i<ls;i++)
         ar[i] = st.nextToken()+" ";
        System.out.println("ENTER THE WORD'S NUMBER YOU WANT TO REMOVE:   ");
        int d = sc.nextInt();
        ar[d-1] = "";
        for(int i=0;i<ls;i++)
            nsen = nsen+ar[i];
        System.out.println("NEW SENTENCE: "+nsen+"\nNUMBER OF WORDS: "+(ls-1));
        sc.close();
    }
}
