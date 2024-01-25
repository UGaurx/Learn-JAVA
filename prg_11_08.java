//Developed by U-Gaur@Github
//Program to Sort Entered Names Alphabetically!!
import java.util.*;
public class prg_11_08
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF NAMES(>4) YOU WANT TO ENTER: ");
        int l = sc.nextInt();
        if(l<4||l>20)
            {
                System.out.println("INVALID INPUT!!!!!");
                System.exit(0);
            }
        String[] ar = new String[l];
        System.out.println("ENTER THE NAMES");
        for(int i=0;i<l;i++)
            ar[i] = sc.next();
        for(int i=0;i<(l-1);i++)
        {
            for(int j=(i+1);j<l;j++)
            {
                if(ar[i].compareTo(ar[j])>0)
                {
                    String temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        System.out.println("SORTED NAMES ARE: ");
        for(int i=0;i<l;i++)
           System.out.println(ar[i]);
        sc.close();
    }
}
