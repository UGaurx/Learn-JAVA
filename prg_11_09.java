//Developed by U-Gaur@Github
//Program to Input numbers and print their frequencies!!
import java.util.*;
public class prg_11_09
{
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF 'NUMBERs' YOU WANT TO ENTER: ");
        int l=sc.nextInt();
        if(l>3&&l<=20)
        {   
            int x=1;
            int[] ar = new int[l];
            System.out.println("ENTER THE NUMBERS: ");

            for(int i=0;i<l;i++)             //INPUTTING NUMBERS
               ar[i] = sc.nextInt();

            for(int i=0;i<(l-1);i++)         //SORTING NUMBERS
               {   
                  for(int j=(i+1);j<l;j++)
                     {      
                        if(ar[i]>ar[j])
                           {   
                              int temp = ar[j];
                              ar[j] = ar[i];
                              ar[i] = temp;  
                           }
                     }     
               }

            for(int i=0; i<l-1; i++)        //CALCULATING FREQUENCY
               { 
                  x=1;
                  for(int j=i+1; j<l; j++)
                    {   
                        if(ar[i] == ar[j])
                        {   
                           x++;
                           ar[j] = 0; 
                        }
                    }
                   if(ar[i] != 0)
                     System.out.println("FREQUENCY OF "+ar[i]+" = "+x);
               }   
         }


         else
            System.out.println("INVALID INPUT!!!!");
         sc.close();
    }
}