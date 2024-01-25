//Developed by U-Gaur@Github
//Program to replace characters of a word with its precedding character(a to b||A to B)!!
import java.util.*;
public class prg_11_13
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE: ");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        int l = st.countTokens();
        String[] ar= new String[l];
        for(int i=0;i<l;i++)
            ar[i]=st.nextToken();
        System.out.println("ENTER FIRST INTEGER: ");
        int i1 = sc.nextInt();
        System.out.println("ENTER SECOND INTEGER: ");
        int i2 = sc.nextInt();int t=0;
        if(i1<1||i1>l||i2<1||i2>l)
        {
            System.out.println("INVALID INPUT!!!! ");
            System.exit(0);
        }
        String s1 = ar[i1-1];
        int ls1 = s1.length();
        ar[i1-1] = "";
        for(int i=0;i<ls1;i++)
        {
            char ch = s1.charAt(i);
            t = ch+1;
            if(ch=='Z'||ch=='z') 
                t=ch-25;
            ar[i1-1]=ar[i1-1]+(char)t;
        }
        String s2 = ar[i2-1];
        int ls2 = s2.length();
        ar[i2-1] = "";
        t=0;
        for(int i=0;i<ls2;i++)
        {
            char ch = s2.charAt(i);
            t = ch+1;
            if(ch=='Z'||ch=='z') 
                t=ch-25;
            ar[i2-1]=ar[i2-1]+(char)t;
        }
        for(int i=0;i<l;i++)
            System.out.print(ar[i]+" ");
        System.out.println();
        sc.close();
    }
}
