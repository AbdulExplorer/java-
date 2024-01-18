package control;

public class q40 
{
  public static void main(String[] args) 
  {
    int x=145;

        if(x%5==0)
        {
            System.out.println(x + " is multiple of 5 ");
        }
        else
        {
            System.out.println(x + " is not multiple of 5");
        }

    String str= x%5==0 ? x + " is multiple of 5 " : x + " is not multiple of 5";
    System.out.println(str);
    }  
}
