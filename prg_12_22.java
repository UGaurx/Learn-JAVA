//Developed by U-Gaur@Github
//Banner maker
import java.io.*;
public class prg_12_22 
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of teams");
        int n = Integer.parseInt(br.readLine());
        if(n>2 && n<9)
        {
            String[] s = new String[n];
            int[] l = new int[n];
            int lt=0;
            for(int i=0; i<n; i++)
            {
                s[i] = br.readLine();
                l[i] = s[i].length();
            }
            for(int i=0; i<n; i++)
                if(l[i]>lt)
                    lt=l[i];
            System.out.println("TEAMS IN VERTICAL FORM: ");
            for(int i=0; i<lt; i++)
            {
                for(int j=0; j<n; j++)
                {
                    if(i>=l[j])
                        System.out.print(" " + "\t");
                    else
                        System.out.print(s[j].charAt(i)+"\t");
                }
                System.out.println(); 
            }
        }
        else
            System.out.println("Invalid Input");
    }
}