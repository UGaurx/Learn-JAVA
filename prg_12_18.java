//Developed by U-Gaur@Github
//Rearranging sentence alphabetically
import java.io.*;
import java.util.*;
public class prg_12_18 
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the sentence");
        String s = br.readLine();
        s = s.toUpperCase();
        char l = s.charAt(s.length()-1);
        if(!(l=='.' || l=='!' || l=='?'))
        {
            System.err.println("Invalid Input!!!");
            System.exit(0);
        }
        s=s.substring(0,s.length()-1);
        StringTokenizer st = new StringTokenizer(s);
        int z = st.countTokens();
        String[] ar = new String[z];
        for(int i=0; i<z; i++)
            ar[i] = st.nextToken();
        System.out.println("Length: " + z);
        for(int i=0; i<ar.length; i++)
            for(int j=0; j<ar.length-i-1; j++)
            {
                int minLen = Math.min(ar[j].length(),ar[j+1].length());
                for(int k=0; k<minLen; k++)
                {
                    if(ar[j].charAt(k)>ar[j+1].charAt(k))
                    {
                        String swap = ar[j+1];
                        ar[j+1] = ar[j];
                        ar[j] = swap;
                        break;
                    }
                    else if(ar[j].charAt(k)<ar[j+1].charAt(k))
                        break;
                }
            }
        for(int i=0; i<ar.length; i++)
        System.out.print(ar[i]+" ");
    }
}