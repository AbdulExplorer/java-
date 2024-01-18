package control;

import java.util.Scanner;

public class q35 
{
  public static void main(String[] args) 
  {
         int x=

        if(x>=2 && x<3)
        {
            System.out.println("Highly Efficient");
        }
        else if(x>=3 && x<4)
        {
            System.out.println("Improve speed");
        }
        else if(x>=4 && x<5)
        {
            System.out.println("Provide training to worker");
        }
        else if(x>=5)
        {
            System.out.println("Leave the company");
        }

    String str=x>=2 && x<3 ? "Highly Efficient" : x>=3 && x<4 ? "Improve speed" : x>=4 && x<5 ? "Provide training to worker" : "Leave the company";
    System.out.println(str);
    }
}
