//Developed by U-Gaur@Github
//Program to input sentences and print them in reversed order with reverswd order of words!!
import java.io.*;
import java.util.*;
public class prg_11_23
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER OF SENTENCES YOU WISH TO INPUT: "); 
        int n= Integer.parseInt(bf.readLine());
        if(n>5)
        {
            System.out.println("INVALID INPUT!!");
            System.exit(0);
        } 
        String[] arr=new String[n]; 
        String str = "";
        System.out.println("ENTER SENTENCES: ");
        for(int i=0;i<n;i++)
            arr[i]  = " "+bf.readLine()+" ";
        for(int i=0;i<n;i++)
            str = str+arr[i];
        StringTokenizer st = new StringTokenizer(str);
        int l = st.countTokens();
        String[] ar= new String[l];
        for(int i=0;i<l;i++)
            ar[i] = st.nextToken();
        for(int i=0;i<l;i++)
        {
            String k = ar[i];
            int len = k.length();
            for(int j=0;j<len;j++)
            {
                char x = k.charAt(j);
                if(x=='.'||x==','||x==':'||x==';'||x=='?'||x=='!')
                    k.replace(k.charAt(j),' ');
            }   
            ar[i] = k;
        }
        str = "";
        for(int i=l;i>0;--i)
            System.out.print(ar[i-1]+" ");
        System.out.println();
        bf.close();
    }
}