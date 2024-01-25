//Developed by U-Gaur@Github
//keith number
import java.io.*;
public class prg_12_08 
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER TO BE TESTED:");
        int n = Integer.parseInt(br.readLine());
        int nn = n;
        int z = 0;
        int flag = 0;
        int x = 0;
        int l = (Integer.toString(n)).length();
        int[] arr = new int[l];
        for(int i=l-1;i>=0;i--)
        {
            arr[i] = n%10;
            n = n/10; 
        }
        System.out.println("SEQUENCE BUILT:");
        while(x<=nn)
        {
            x = 0;
            for(int j=0;j<l;j++)
                x = arr[j] + x;
            System.out.println(x);
            arr[z] = x;
            z = z+1;
            if(z >= l)
                z = 0;
            if(x == nn) 
                flag = 1;                                
        }
        if(flag == 1)
            System.out.println("THE NUMBER IS KEITH!!");
        else
            System.out.println("THE NUMBER IS NOT KEITH!!");
    }
}