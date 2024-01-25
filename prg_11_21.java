//Developed by U-Gaur@Github
//Program to check PASSWORD strength!!
import java.util.Scanner;
public class prg_11_21
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);System.out.println("ENTER YOUR PASSWORD: ");
      String str = sc.nextLine();
      boolean l=false,u=false,s=false,d=false;
      int len=str.length();
      for(int i=0;i<len;i++)
      {
         char x = str.charAt(i);
         if(x==(Character.toLowerCase(x)))
            l=true;
         if(x==(Character.toUpperCase(x)))
            u=true;
         if(x=='!'||x=='@'||x=='#'||x=='$'||x=='%'||x=='^'||x=='&'||x=='*'||x=='('||x==')'||x=='-'||x=='+')
            s=true;
         if(x=='0'||x=='1'||x=='2'||x=='3'||x=='4'||x=='5'||x=='6'||x=='7'||x=='8'||x=='9')
            d=true;
      }
      if(l==true&&u==true&&s==true&&d==true&&len>=8)
        System.out.println("Password Strength: Strong ; )");
      else if(l==true&&u==true&&s==true&&len>=6)
         System.out.println("Password Strength: Moderate :("); 
      else
         System.out.println("Password Strength: Weak :/");
      sc.close();
    }
}
