//Developed by U-Gaur@Github
//three words shuffle validator
import java.io.*;
public class prg_12_23 
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three sentences");
        String s1,s2,s3;
        int l1,l2,l3;
        String t1,t2;t1="";t2="";
        char c='\u0000';
        s1 = br.readLine();
        s2 = br.readLine();
        s3 = br.readLine();
        l1 = s1.length();
        l2 = s2.length();
        l3 = s3.length();
        if(l3 ==  (l1+l2))
        {
            for(int i=0; i<l3; i++)
            {
                c = s3.charAt(i);
                for(int j=0; j<l1; j++)
                    if(c == s1.charAt(j))
                        t1 = t1+c;
                for(int k=0; k<l2; k++)
                    if(c == s2.charAt(k))
                        t2 = t2+c;
            }
            System.out.println(t1 + " " + t2);
            if(t1.equalsIgnoreCase(s1) == true  &&  t2.equalsIgnoreCase(s2) == true)
                System.out.println("Third is a valid Shuffle");
            else
                System.out.println("Third is not a valid shuffle");
        }
        else
            System.err.println("Invalid Input");

    }
}