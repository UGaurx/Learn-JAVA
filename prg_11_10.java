//Developed by U-Gaur@Github
//Program to input 4 numbers and 3 mathematical symbols and perfrom calculation!!
import java.util.*;
public class prg_11_10
{
    public static void main(String[] args)
    {
        int[] a = new int[4];
        String[] b = new String[3];
        String ms="";
        int s =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBERS");
        for(int i=0;i<4;i++)
            a[i] = sc.nextInt();
        System.out.println("ENTER MATHEMATICAL SYMBOLS");
        for(int i=0;i<3;i++)
        {
            ms = sc.next();
            if(ms.equals("+")||ms.equals("-")||ms.equals("*")||ms.equals("/"))
                b[i]=ms;
            else
            {
                System.out.println("INVALID INPUT !!");
                System.exit(0);
            }
        }
        String r = "((("+a[0]+b[0]+a[1]+")"+b[1]+a[2]+")"+b[2]+a[3]+")";s = a[0];
        for(int i = 0;i<3;i++)
        {
            if(b[i].equals("+"))
                s = s+a[i+1];
            if(b[i].equals("*"))
                s = s*a[i+1];
            if(b[i].equals("-"))      
                s = s-a[i+1];
            if(b[i].equals("/"))
                s = s/a[i+1];
        }
        System.out.println(r+" = "+s);
        sc.close();
    }
}
