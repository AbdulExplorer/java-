package control;

public class q16 
{
 public static void main(String[] args) 
 {
   int a=242,b=232,c=242;
   if(a==b&&b==c)
   System.out.println("it is a equilateral triangle");
   else if(a==b||a==c||b==c) 
   System.out.println("it is a isoseles triangle");
   else 
   System.out.println("it is scelene triangle");
 }   
}
