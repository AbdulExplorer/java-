package control;
import java.util.Scanner;

public class q39 
{
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1=sc.nextInt();

        System.out.println("Enter second number : ");
        int n2=sc.nextInt();

        System.out.println("Operations :::::");
        System.out.println(" 1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division \n 5. Modulo");
        System.out.println("Enter your choice : ");
        int x=sc.nextInt();

        if(x==1)
        {
            System.out.println("Sum = " +(n1+n2));
        }
        else if(x==2)
        {
            System.out.println("Substraction = " +(n1-n2));
        }
        else if(x==3)
        {
            System.out.println("Multiplication = " +(n1*n2));
        }
        else if(x==4)
        {
            System.out.println("Division = " +(n1/n2));
        }
        else if(x==5)
        {
            System.out.println("Remainder = " +(n1%n2));
        }
        else
        {
            System.out.println("Invalid input");
        }

String str = (x==1) ? "Sum = " +(n1+n2) : x==2 ? "Substraction = " +(n1-n2) : x==3 ? "Multiplication = " +(n1*n2) : x==4 ? "Division = " +(n1/n2) : x==5 ? "Remainder = " +(n1%n2) : "Invalid input";
System.out.println(str);   
    }  
}
