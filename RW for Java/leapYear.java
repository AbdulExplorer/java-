public class leapYear 
{
  public static void main(String[] args) 
  {
    int year=2004;
   
    // ternary operator method

    //String y= year%4==0 ? year%400==0 ? "it is a leap year" : year%400==0 ? "it is a leap year" : "it is not a leap year" : "it is not a leap year" ;
    
    String y= year%4==0 ? year%100!=0 ? "it is a leap year" : year%400==0 ? "it is a leap year" : "it is not a leap year": "it is not a leap year";
    System.out.println(y);

    //Normal if / else method
    //if (year%4==0)
     
    //   {
    //   if (year%100!=0)
    //     {
    //       System.out.println("it is a leap year");
    //     }
    //   else if(year%400==0)
    //     {
    //       System.out.println("it is a leap year");
    //     }
    //  else
    //     {
    //       System.out.println("it is not a leap year");
    //     } 
    //   }

    // else
    //    {
    //      System.out.println("it is not a leap year");
    //    }
    // System.out.println("well done");

  }
}  
