//Developed by U-Gaur@Github
//Program to print time!!
import java.util.Scanner;
public class prg_11_02
{
    public static void main(String[] args)
    {   
        try{
        Scanner sc = new Scanner(System.in) ;
        System.out.println("ENTER HOUR:");
        int h = sc.nextInt();
        System.out.println("ENTER MINUTES:");
        int m = sc.nextInt();
        String time = "";
        int a=0;
        int b=0;//ARRAY OF LENGTH 30 WITH COUNTING TO TWENTY NINE
        String[] count = {"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN","TWENTY","TWENTY ONE","TWENTY TWO","TWENTY THREE","TWENTY FOUR","TWENTY FIVE","TWENTY SIX","TWENTY SEVEN","TWENTY EIGHT","TWENTY NINE",""};
        if(m<0||m>59||h<0||h>12){System.out.println("INVALID INPUT.");System.exit(0);}
        if(m==0||m==15||m==30||m==45)
        {
                                if(m==0)                   
                                {
                                    System.out.println(h+":"+"00");
                                    System.out.println(count[h]+" O'CLOCK"+"\n");
                                    System.exit(0);
                                }
                                if(m==15)               
                                {
                                    time = "QUARTER PAST ";a=h;
                                }
                                if(m==30)                
                                {
                                    time = "HALF PAST ";a=h;
                                }
                                if(m==45&&h==12)        
                                {
                                    time = "QUARTER TO "; a=1;
                                }
                                if(m==45&&h!=12)         
                                {
                                    time = "QUARTER TO "; a=h+1;}
                                    System.out.println(h+":"+m);        
                                    System.out.println(time + count[h] +"\n");
                                    System.exit(0);
                                }
        if(m!=0||m!=15||m!=30||m!=45)
        {
                                if(m>0&&m<30)            
                                {
                                    time = " MINUTES PAST ";a=h;b=m;
                                }
                                if(m>30&&m<60)           
                                {
                                    time = " MINUTES TO "; a = h+1; b = 60-m;
                                }
                                if(m>30&&m<60&&h==12)    
                                {
                                    time = " MINUTES TO "; a = 1; b = 60-m;
                                }
                                System.out.println(h+":"+m);
                                System.out.println(count[b] + time + count[a]+"\n");
                                System.exit(0);
        }sc.close();
    } 
    catch(Exception e)
    {
        e.printStackTrace();
    }    
}}
