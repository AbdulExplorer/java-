package control;

public class q24 
{
 public static void main(String[] args)
  {
        float x=5000;

        if(x<1500)
        {
            float salary =(float) (x + x*0.1 + x*0.9);
            System.out.println("Gross salary : " + salary);
        }
        else if(x>=1500)
        {
            float salary = (float) (x + 500 + x*0.98);
            System.out.println("Gross salary : " + salary);
        }


    }   
}
