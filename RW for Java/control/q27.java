package control;

import java.util.Scanner;

public class q27 
{
   public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gender of the person");
        String gen = sc.nextLine();
        
        System.out.println("Enter the year of services");
        int expYr = sc.nextInt();
        System.out.println("Enter the qualification");
        String qual= sc.nextLine();
       
        if(gen=="male")
        {
        if(expYr>=10 && qual=="post-graduate" )
        {
           System.out.println("salary :"+15000);
        }
        else if(expYr>=10 && qual=="graduate" )
        {
           System.out.println("salary :"+10000);
        }
         else if(expYr<10 && qual=="post-graduate" )
        {
           System.out.println("salary :"+10000);
        }
        else if(expYr<10 && qual=="graduate" ){
            System.out.println("salary :"+7000);
        }
    }
         if(gen=="female")
        {
        if(expYr>=10 && qual=="post-graduate" )
        {
           System.out.println("salary :"+12000);
        }
        else if(expYr>=10 && qual=="graduate" )
        {
            System.out.println("salary :"+9000);
        }
         else if(expYr<10 && qual=="post-graduate" )
        {
           System.out.println("salary :"+10000);
        }
        else if(expYr<10 && qual=="graduate" )
        {
            System.out.println("salary : " + 6000);
        }

    }
        
    } 
}
