package control;

import java.util.Scanner;

public class q26 
{
  public static void main(String[] args) 
  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter martial status (M/U) : ");
        char status = sc.next().charAt(0);

        System.out.println("Enter age : ");
        int age=sc.nextInt();

        System.out.println("Enter gender (M/F) : ");
        char gender = sc.next().charAt(0);

        if(status=='M')
        {
            System.out.println("Insured.");
        }
        else if(status=='U' && age>30 && gender=='M')
        {
            System.out.println("Insured");
        }
        else if(status=='U' && age>25 && gender=='F')
        {
            System.out.println("Insured.");
        }
        else
        {
            System.out.println("No Insured");
        }

    String str = status=='M' ? "Insured" : status=='U' && age>30 && gender=='M' ? "Insured" : status=='U' && age>25 && gender=='F' ? "Insured" : "No Insured";
    System.out.println(str);

    }  
}
