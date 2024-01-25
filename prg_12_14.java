//Developed by U-Gaur@Github
//common words calculator
import java.io.*;
import java.util.*;
public class prg_12_14
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter paragraph with two sentences");
        String sen = br.readLine();
        StringTokenizer st = new StringTokenizer(sen,(".!?"));
        int n =st.countTokens();
        if(n==2)
        {
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            StringTokenizer st1 = new StringTokenizer(s1,(".?!"));
            int a = st1.countTokens();
            String[] w1 = new String[a];
            int i = 0;
            while(st1.hasMoreTokens() )
                w1[i++] = st1.nextToken();
            StringTokenizer st2 = new StringTokenizer(s2);
            int b = st2.countTokens();
            String[] w2 = new String[b];
            i = 0;
            while(st2.hasMoreTokens())
                w2[i++] = st2.nextToken();
            String[] comm = new String[a];
            int[] freq = new int[a];
            int x = 0;
            for( i=0; i<a; i++)
            {
                String word = w1[i];
                for(int j=0; j<b; j++)
                {
                    String word1= w2[j];
                    if(word.equals(word1))
                    {
                        comm[x]=word;
                        freq[x]=2;
                        x++;
                        w1[i]="";
                        w2[i]="";
                        break;
                    } 
                } 
            }
            i=0;
            while(i < x)
            {
                for(int p=0; p<a; p++)
                    if(comm[i].equals(w1[p]))
                    {
                        freq[i]++;
                        for(int q=0; p<b; p++)
                        {
                            if(comm[i].equals(w2[q]))
                            freq[i]++; 
                        }
                        i++;
                    }
                System.out.println(s1);
                System.out.println(s2);
                if(x != 0)
                {
                    System.out.println("Common words\t" + "Frequency");
                    for( i=0; i<x; i++)
                    System.out.println(comm[i] + "\t" + freq);
                }
                else
                    System.out.println("No common words ");
            }
        }
        else
            System.err.println("Invalid Input");
        
    }
}