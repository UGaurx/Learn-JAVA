//Developed by U-Gaur@Github
//Program to check Fascinating Number!!
import java.util.*;
public class prg_11_12
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("ENTER THE NUMBER TO BE TESTED: ");
      int numb = sc.nextInt();
      if(numb>99)
      {
         int flag=0;
         String num = "" + numb + (numb*2) + (numb*3);
         int l = num.length();
         System.out.println(num+"\n"+l);
         char[] ar = new char[l];

         for(int i=0;i<l;i++)
            ar[i] = num.charAt(i);
               
         for(int i=0;i<l-1;i++)
            for(int j=i+1;j<l;j++)
               if(ar[i]!='0'&& ar[i]==ar[j])
                     flag=1;

         if(flag == 0)
            System.out.println(numb+" "+"IS A FASCINATING NUMBER...");
         else
            System.out.println(numb+" "+"IS NOT A FASCINATING NUMBER...");
        }
        else
           System.out.println("INVALID INPUT!!!!");
         sc.close();
    }
}