package pattern;
import java.util.Scanner;
public class pr
//we done this question after array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter your operetion");
        String o = sc.next();

        System.out.println("Enter number of operands");
        int n = sc.nextInt();

        for(int x=1; x<=n; x++)
        {  
         System.out.println("Enter operand :");
         int a = sc.nextInt();
         System.out.println("Enter its data type :");
         String b = sc.next();
        
        if(b=="int")
        {
         if(o=="*")
         {
             System.out.println();
         }   
        }
    }

        // System.out.println("Enter first number :");
        // int a = sc.nextInt();

        // System.out.println("Enter second number :");
        // int b = sc.nextInt();

        // System.out.println("Enter third number :");
        // int c = sc.nextInt();

        //  System.out.println("Enter fourth number :");
        // int d = sc.nextInt();

        //  System.out.println("Enter fivth number :");
        // int e = sc.nextInt();

        // if(o=="*")
        // {
        //     System.out.println(a*b*c*d*e);
        // }
        // else if(o=="/")
        // {
        //     System.out.println(a/b/c/d/e);
        // }
        // else if(o=="+")
        // {
        //     System.out.println(a+b+c+d+e);
        // }
        // else
        // {
        //     System.out.println(a-b-c-d-e);
        // }

        


        



        




    }    
}
