//Developed by U-Gaur@Github
//array score calculator
import java.io.*;
public class prg_12_9 
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NO. OF PARTICIPANTS:");
        int m = Integer.parseInt(br.readLine());
        if(m<4||m>10)
        {
            System.err.println("INVALID INPUT!!!");
            System.exit(0);
        }
        String[][] arr = new String[m][5];
        String[] key = new String[5];
        int[] mar = new int[m];
        int high =0;
        System.out.println("ENTER THE ANSWERS:");
        for(int i=0;i<m;i++)                //input(ing) answers...
        {
            System.out.println("PARTICIPANT "+(i+1));
            for(int j=0;j<5;j++)   
                arr[i][j] = br.readLine();
        }
        System.out.println("ENTER THE ANSWER KEY: ");
        for(int i=0;i<5;i++)
            key[i] = br.readLine();
        for(int i=0;i<m;i++)              //calculating marks...
        {
            int marks = 0;
            for(int j=0;j<5;j++)
                if(arr[i][j].equals(key[j]))
                    marks++;
            mar[i] = marks;
        }
        for(int i=0;i<m-1;i++)
            for(int j=1;j<m;j++)
                if(mar[j]>mar[i])
                    high = i+2;            //calculating highest mark
        System.out.println("SCORES: ");
        for(int i=0;i<m;i++)
            System.out.println("PARTICIPANT " + (i+1) + "= " + mar[i]);
        System.out.println("HIGHEST SCORE: \nPARTICIPANT "+ high);
    } 
}