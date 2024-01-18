package pattern.star;

import java.util.Scanner;

public class RAtriMirror 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);

      System.out.print("Enter a number of collums to print pattern :");
      int n = sc.nextInt();

      for(int r=n; r>1; r--) //int x=1; x<=5; x++
      {
        for(int c=0; c<=r; c++) //int i=1; i<=(n-x)+1; i++
        {
            System.out.print("* ");
        }
        System.out.println();
      }
      for(int r=1; r<=n; r++)
      {
        for(int c=0; c<r; c++)
        {
           System.out.print("* ");
        }
        System.out.println();
      }
    }  

}
