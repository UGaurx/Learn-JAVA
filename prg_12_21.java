//Developed by U-Gaur@Github
//longest word finder.
import java.io.*;
import java.util.*;
public class prg_12_21
{
    String sentence;
    prg_12_21()
    {
        sentence = "";
    }
    void input()throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The sentence");
        sentence = br.readLine();
        if(!(sentence.endsWith(".") || sentence.endsWith("!") || sentence.endsWith("?")))
        {
            System.err.println("Invalid Input!!!");
            System.exit(0);
        }
        sentence = sentence.substring(0,sentence.length()-1);
    }
    String findLongestWord()
    {
        StringTokenizer st = new StringTokenizer(sentence);
        int max = 0;
        String longest = "";
        while(st.hasMoreTokens())
        {
           String word = st.nextToken();
           if(word.length() > max)
           {
               max = word.length();
               longest = word;
           } 
       }
        return longest;
    }
    String convert(String word)
    {
        String convWord = "";
        for(int i=0; i<word.length(); i++)
        switch(word.charAt(i))
        {
            case 'A': convWord=convWord+"E";
            break;
            case 'E': convWord=convWord+"I";
            break;
            case 'I': convWord=convWord+"O";
            break;
            case 'O': convWord=convWord+"U";
            break;
            case 'U': convWord=convWord+"A";
            break;
            default : convWord=convWord+word.charAt(i);
        }
        return convWord; 
    }
    public static void main(String[] args)throws Exception
    {
        prg_12_21 ob = new prg_12_21();
        ob.input();
        System.out.println(ob.convert(ob.findLongestWord()));
    }
}