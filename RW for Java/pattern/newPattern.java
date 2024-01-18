package pattern;

import java.util.Scanner;

public class newPattern 
{
 public static void main(String[] args) 
 {
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt() ;

   for(int r=1,p=1 ; r<=n ; r++,p+=2)
   {
    for(int c=1; c<=r; c++)
    {
       System.out.print(p+" ");
    }
   System.out.println();
   } 

   for(int r=1,p=5 ; r<=n; r++,p-=2)
   {
    for(int c=r; c<n; c++)
    {
        System.out.print(p+" ");
    }
    System.out.println();
   }
 }   
}
