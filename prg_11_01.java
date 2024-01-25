//Developed by U-Gaur@Github
//Program to print number in words!!
import java.util.*;
public class prg_11_01
{
    public static void main(String []args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER A MAX FOUR DIGIT NUMBER: ");
            String words = ""; 
            String num; num = sc.next();  String n = num;  int l = n.length();
            for(; ;)
            {
                if(l <= 4)
                break;
                else{
                    System.out.println("INVALID INPUT...\nENTER AGAIN A 4 DIGIT NUMBER");
                    num=sc.next();l=num.length();
                }
            }
            int x = Integer.parseInt(num);
            String[] spell = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN"};
            for(int i=0;i<l;i++)
            {
                int y = x % 10;
                x = x/10;
                words = spell[y] + " " + words;
            }
            System.out.println("\n NUMBER ENTERED:   "+num);
            System.out.println("IN WORDS: "+words+"\n\n\n");
        } 
        catch (NumberFormatException e) 
        {
            e.printStackTrace();
        }
    }
}