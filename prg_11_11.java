//Developed by U-Gaur@Github
//Program to input numbers and print sum of all even numbers and product of all odd numbers!!
import java.util.*;
public class prg_11_11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int l = 0;
        long[] ar;
        long o=1;
        long e=0;
        System.out.println("ENTER NUMBER OF 'NUMBERs' YOU WANT TO ENTER: ");
        l = sc.nextInt();
        ar = new long[l];
        if(l<4||l>20)
        {   
            System.out.println("INVALID INPUT!!!!");
            System.exit(0);    
        }
        System.out.println("ENTER THE NUMBERS: ");
        for(int i=0;i<l;i++)
            ar[i] = sc.nextInt();
        for(int i=0;i<(l-1);i++)
        {   
            for(int j=(i+1);j<l;j++)
            {      
                if(ar[i]>ar[j])
                {   
                    long temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;  
                }
            }     
        }
        System.out.println("LARGEST NUMBER:  "+ar[l-1]+"\nSMALLEST NUMBER:  "+ar[0]);  
        for(int i=0;i<(l);i++)
            {
                if((ar[i]%2)==0)
                    e=e+ar[i];
                if((ar[i]%2) ==1)
                    o=o*ar[i];}
        System.out.println("PRODUCT OF ALL THE ODD NUMBERS:  "+o+"\nSUM OF ALL EVEN NUMBERS:  "+e);
        sc.close();
    }
}
