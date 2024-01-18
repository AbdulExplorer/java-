package control;

public class q6 
{
   public static void main(String[] args) 
   {
     int a=2003;
     if(a%4==0)
     {
        if(a%100!=0)
        System.out.println(a+" is a leap year");
        else if(a%400==0)
        System.out.println(a+" is a leap year");
        else
        System.out.println(a+" is not a leap year");
     }  
     else
     System.out.println(a+" is not a leap year");
   } 
}
