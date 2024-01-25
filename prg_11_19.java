//Developed by U-Gaur@Github
//-----------------
import java.util.*;
public class prg_11_19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER INPUT!!!");
        String s = sc.nextLine();s = " "+s+" ";
        int l = s.length();
        for(int i=1;i<l-1;i++)
        {
            char x = s.charAt(i);
            if(x==(s.charAt(i+1))&&x!=(s.charAt(i-1)))
                System.out.print(x);
            else if(x!=(s.charAt(i+1))&&x!=(s.charAt(i-1)))
                System.out.print(x);
        }
        System.out.println();
        sc.close();
    }
}
