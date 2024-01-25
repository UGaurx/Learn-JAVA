//Developed by U-Gaur@Github
//cartons calculator
import java.io.*;
public class prg_12_20 
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of boxes");
        int n = Integer.parseInt(br.readLine());
        if(n>1000 || n<0)
        {
            System.err.println("Invalid Input!!!");
            System.exit(0);
        }
        int cartons = 0;
        for(int i=48;i>5;i/=2)
        {
            int c = (int)Math.floor(n/i);
            cartons += c;
            if(c != 0)
            {
                System.out.println(i + " x " + c + " = " + (i*c));
                n = n%i;
            }
        }
        if(n<6)
            cartons++;
        System.out.println("Remaining boxes : " + n);
        System.out.println("Cartons Used : \t" + cartons);

    }
}