package control;

public class q28 
{
  public static void main(String[] args) 
  {
        int x=78543;
        int n=x;
        int rev=0;
        while(x!=0)
        {
            int rem = x%10;
            rev= rev*10 + rem;
            x=x/10;
        }
        System.out.println("Reversed number is : " + rev);

        if(n==rev)
        {
            System.out.println("Both number are equal.");
        }
        else
        {
            System.out.println("Number are not equal.");
        }
        

    }  
}
