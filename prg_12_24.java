//Developed by gaurutkarsh05
//word swapper & sort-er
import java.io.*;
public class prg_12_24 
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word");
        String w = br.readLine();
        System.out.println("Original Word:"+w);
        String s = w.charAt(w.length()-1)+w.substring(1,w.length()-1)+w.charAt(0);
        System.out.println("Swapped Word:"+s);
        for(int i=0; i<w.length(); i++)
            for(int j=0; j<w.length()-i-1; j++)
                if(w.charAt(j) > w.charAt(j+1))
                    w = w.substring(0,j) + w.charAt(j+1)+w.charAt(j)+w.substring(j+2);
        System.out.println("Alphabetical order:" + w);
    }
}