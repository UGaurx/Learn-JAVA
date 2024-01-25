//Developed by U-Gaur@Github
//Program to check input number is a VALID DATE or Not!!
import java.util.Scanner;
public class prg_11_03
{
    public static void main(String[] args)
    {
        
      try
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER(8 DIGIT)");
        int numb = sc.nextInt();
        int num=numb;
        int flag=0;
        int inv= 0;
        if(num/100000000 !=0)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        int ly= num%100;
        int y = num%10000;num=num/10000;
        int m = num%100;num=num/100;
        int d = num;
        if(numb%4==0)
        {
           flag = 1;
           if(ly==00)
           {
              if(numb%400==00)
              flag=1; 
              else   
              flag=0;    
           }
        }
        if(m<1||m>12||d<01||d>31)
           inv=1;  
        if(m==04||m==06||m==9||m==11)
          if(d<1||d>30)
            inv=1;
        if(flag!=1)
          if(m==02&&d>28)
            inv=1;
        else
        {
           if(m==02&&d>29)
              inv=1;
        }
        System.out.println("DATE ENTERED: "+"\n"+d+"/"+m+"/"+y);
        if(inv==1)
          System.out.println("INVALID DATE....."+"\n");
        else
          System.out.println("VALID DATE :) ;)"+"\n");
        sc.close();
       }
       catch(Exception e)
       {
         e.getLocalizedMessage();
       }
}
}