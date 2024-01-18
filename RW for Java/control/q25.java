package control;

import java.util.Scanner;

public class q25 
{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first mark : ");
        int n1=sc.nextInt();

        System.out.println("Enter first mark : ");
        int n2=sc.nextInt();

        System.out.println("Enter first mark : ");
        int n3=sc.nextInt();

        System.out.println("Enter first mark : ");
        int n4=sc.nextInt();
        System.out.println("Enter first mark : ");
        int n5=sc.nextInt();

        int total = n1 + n2 + n3 + n4 + n5;

        System.out.println("Total mark obtain : " + total);

        float percent = (total/5);
        System.out.println("Percentage : " + percent);

        if(percent>=60)
        {
            System.out.println("First division");
        }
        else if(percent>=50 && percent<=59)
        {
            System.out.println("Second Division");
        }
        else if(percent>=40 && percent<=49)
        {
            System.out.println("Third Division");
        }
        else if(percent<40)
        {
            System.out.println("Fail");
        }

    String str= percent>=60 ? "First division" : percent>=50 && percent<=59 ? "Second Division" : percent>=40 && percent<=49 ? "Third Division" : "Fail";
    System.out.println(str);

    }  
}
