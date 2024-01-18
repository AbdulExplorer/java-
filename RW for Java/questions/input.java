package questions;

import java.util.Scanner; 

public class input 
{
  
  public static void main(String[] args) 
  {

    Scanner sc = new Scanner(System.in);

    System.out.println("enter your name :");
    String name = sc.nextLine();

    System.out.println("Enter your age :");
    int age = sc.nextInt();

    System.out.println("enter your selery :");
    int selery = sc.nextInt();
    
    System.out.println(name);  
    System.out.println(age);
    System.out.println(selery);

  }
}
