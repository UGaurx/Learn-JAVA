//Developed by U-Gaur@Github
//Program to check if number is prime or not, if not print next closest prime number!!
import java.util.Scanner;
public class prg_11_22
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("ENTER THE NUMBER <100: ");
      int n = sc.nextInt();
      if(n>100)
      {
        System.out.println("INVALID INPUT!!!");System.exit(0);  
      }   
      boolean flag = false;
      for (int i = 2; i <= n / 2; ++i) 
          if (n % i == 0) 
          {
            flag = true;
            break;
          }                                                   
      if(flag == true)
      {
        int[] arr = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        for(int i=0;i<26;)
        if(arr[i] < n)
          i++;
        else
        {
          System.out.println("THE NUMBER IS NOT PRIME \n NEXT PRIME NUMBER IS "+arr[i]);
          System.exit(0);
        }
      }
      else
        System.out.println("THE NUMBER IS PRIME!!");
      sc.close();
    }
}
